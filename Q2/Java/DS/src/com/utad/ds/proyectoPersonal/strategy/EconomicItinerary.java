package com.utad.ds.proyectoPersonal.strategy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.utad.ds.proyectoPersonal.common.Stage;
import com.utad.ds.proyectoPersonal.common.StageType;
import com.utad.ds.proyectoPersonal.abstractFactory.EconomicPackageFactory;
import com.utad.ds.proyectoPersonal.abstractFactory.PackageFactoryContext;
import com.utad.ds.proyectoPersonal.abstractFactory.activity.Activity;
import com.utad.ds.proyectoPersonal.abstractFactory.transport.Transport;
import com.utad.ds.proyectoPersonal.common.Itinerary;
import com.utad.ds.proyectoPersonal.decorator.CustomTripComponent;
import com.utad.ds.proyectoPersonal.factory.EconomicStageFactory;
import com.utad.ds.proyectoPersonal.factory.StageFactory;

public class EconomicItinerary implements ItineraryStrategy {
	private StageFactory stageFactory;
	private PackageFactoryContext packageFactoryContext;
	public EconomicItinerary() {
		this.stageFactory = EconomicStageFactory.getInstance();
		this.packageFactoryContext = PackageFactoryContext.getInstance();
		this.packageFactoryContext.setFactory(new EconomicPackageFactory());
	}
	@Override
	public Itinerary planItinerary(CustomTripComponent customTripComponent) {
		List<Stage> stages = new ArrayList<Stage>();
		stages.add(this.createDepartureFlight(customTripComponent));
		List<Stage> activityStages = this.createActivities(customTripComponent);
		for(Stage stage : activityStages) {
			stages.add(stage);
		}
		stages.add(this.createReturnFlight(customTripComponent));
		Double totalCost = 0d;
		for(Stage activity : stages) {
			totalCost += activity.getCost();
		}
		Duration duration = Duration.between(stages.getFirst().getStart(), stages.getLast().getEnd());
		return new Itinerary("Economic Itinerary:\n" + customTripComponent.getDescription(), stages, totalCost, duration);
	}
	private Stage createDepartureFlight(CustomTripComponent customTripComponent) {
		Transport transport = this.packageFactoryContext.createTransport();
		LocalDateTime start = customTripComponent.getTripData().getDepartureDate().atTime(10, 0);
		LocalDateTime end = start.plusHours(2);
		return this.stageFactory.createStage(transport.getDescription(), start, end, transport.getCost(), StageType.TRANSPORT);
	}
	private List<Stage> createActivities(CustomTripComponent customTripComponent) {
		LocalDateTime start = customTripComponent.getTripData().getDepartureDate().atTime(10, 0);
		List<Stage> stages = new ArrayList<Stage>();
		List<Activity> activities = this.packageFactoryContext.createActivities();
		for (int i = 0; i < customTripComponent.getTripData().getTravelDays(); i++) {
			LocalDateTime activityStart = start.plusDays(i).withHour(12);
			LocalDateTime activityEnd = activityStart.plusHours(2);
			for(Activity activity : activities) {
				stages.add(this.stageFactory.createStage(activity.getDescription(), activityStart, activityEnd, activity.getCost(), StageType.ACTIVITY));
			}
		}
		return stages;
	}
	private Stage createReturnFlight(CustomTripComponent customTripComponent) {
		Transport transport = this.packageFactoryContext.createTransport();
		LocalDateTime returnStart = customTripComponent.getTripData().getReturnDate().atTime(14, 0);
		LocalDateTime returnEnd = returnStart.plusHours(2);
		return this.stageFactory.createStage(transport.getDescription(), returnStart, returnEnd, transport.getCost(), StageType.TRANSPORT);
	}
}