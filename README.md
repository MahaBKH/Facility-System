# Facility System Project 

This project is a facility management system to manage multiple buildings that are managed by one entity. It carries three main classes. 
First, The facility which carries functionalities such as adding a new facility, removing facilities and listing all of facilities. Second, facility maintenance, to help to maintain the facility. It carries functionalities such as making maintenance request and scheduling maintenance.Lastly, facility use, it carries functionalities such as determine the actual use of the facility and list all inspections of the facility .
This project was made with Spring.



## Installation Instructions

```
git clone <Repo URL> 
```

## Running Instructions

Please run the project using eclipse, with your eclipse workspace working accordingly.

## Testing

All relevant tests can be found under the tests folder. Please run using JUnit 4 to ensure that the tests run properly. Some smaller tests can also be found under view as well. 

## UML Diagram
![UML](https://raw.githubusercontent.com/MahaBKT/Facility-System/master/Documents/UML.png)

## Spring Elements information
The bean configurations for Spring can be found under src/META-INF/app-context.xml. The bean graph is shown below:
![SPRING](https://raw.githubusercontent.com/MahaBKT/Facility-System/master/Documents/Spring.png)



## Specifications

##### Facility
```
addNewFacility
addFacilityDetail
removeFacility
listFacilities
getFacilityDetails
```

##### Maintenance
```
makeFacilityMaintRequest
scheduleMaintenance
calcMaintenanceCostForFacility
listMaintenance
listMaintRequests
calcProblemRateForFacility
calcDownTimeForFacility
listFacilityProblems
```

##### Usage
```
listActualUsage
listInspection
calcUsageRate
assignFacilityToUse
vacateFacility
isInUseDuringInterval
```


## Built With
```
Spring
Java 1.8
JUnit 4
```
