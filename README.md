
#SpringBoot Notes From Strach 


Enterprisse Application: |

									   ->Reqruires--> frameWork |

																				  -->The amkes Development : Simple,Easy,Productive

Entriprise Applicaation: An applicatin consumed by millinos od user simultionously

 



JAVA ANTHEM : In java we represent everything in the form of object accept primitive datatype

FrameWoroks : Make the developer Works easy, Simple, Productive



SpringBoot: 

What is Spring Booot ?

It a java Framework.

	Spring have 2anmol ratan 	-- Inversion of Control

												-- Dependency Injection



Why it is used ? 

It is used to for creation of object and obtain object implicitly(Automitaclly)



Maven 

It is used to get all the dependencies and jar files from internet



Note: Application built using springframework, then it s known as spring Appplication

		-->	Spring Application require lots of configuration but you can minimize/skip configuration using springoot



					Data

JavaApp ------------------> DB <------------------MYDQL

	:				server

	:

	:-> Need Object



-- > The core principle of SpringFramework are : Inversion of control , Dependency Injection

			purpose :  Creation & management of required object implicitly(Automatically)



Mandatory Dependencies:- Spring Web WEB

											Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.



Optional:-Spring Boot DevTools DEVELOPER TOOLS

				Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

				:- It is use to Live reload the serve evening project is running if we edit it reloads automitaclly



@RequestionMapping("/endpoint") : It is use for Grouping the controller to ignore the confusion becase there will be many controller and they have the same methods. eg:-			  RequestMapping("/test")

@RestController annotation: It is use to call method of a class from browser.



@GetMapping annotation : It is use to map the method. which  call the method directly from the browser existed in the class.

	Eg:-	@GetMapping("/cricket")

  public String getDailyWorkout(){

    return "Wait for now , Coach is sleeping";

  }





Interface: To hide the implementation from the user we use the Interface , we will be creating method in that interface that will be call by another class 





10/12/2023

	Task1: Create a spring Project that perform db crud Operation

Step 1: Visit the spring Initializr

				--> Project: Maven

				--> Language: Java

Step 2 : Project MetaData: 3.2.0

								-->Group : Write the reverse name of the compmany(com.assnise)

								-->Artificate: dbCurd (Project Name)

								-->Packging: Jar

								-->JDK Version : 21/17

Step 3: Add Dependencies for this spring project

				-->Spring web

				-->Spring DevTools

				-->Spring Data JPA

				-->MYSQL Drivers

Use this database : https://writexo.com/rst-developer-sunday

