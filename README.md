**Portfolio Website Project**

A dynamic and responsive personal portfolio website developed using modern technologies such as Spring Boot, Thymeleaf, MySQL, Spring Data JPA, Hibernate, and Bootstrap.
This website serves as a platform to showcase projects, skills, education, and work experience, with an integrated admin dashboard for managing content.

Features
Responsive Design
Optimized to work on desktops, tablets, and mobile devices.

Dynamic Content
Projects, skills, and other data are stored in a MySQL database and rendered dynamically using Thymeleaf.

Form Validation
Spring Boot validation ensures accurate and clean form submissions.

Admin Dashboard
A secure admin interface to perform CRUD operations (Create, Read, Update, Delete) on portfolio data such as projects, education, skills, and work experience.

Rate Limiting for Security
Integrated with Bucket4j to limit API requests and prevent abuse (different limits for homepage access and contact form submissions).

Modern Styling
Designed with custom CSS and Bootstrap for a clean and interactive user interface.

Interactive UI
JavaScript is used for smooth interactions and enhancing user experience.

Technologies Used
Backend
Spring Boot

Thymeleaf

Spring Data JPA

Hibernate

Database
MySQL

Frontend
HTML5

CSS3

JavaScript

Bootstrap

Additional Tools
Validation: Spring Boot validation

Rate Limiting: Bucket4j

Build Tool: Maven

Java Version: Java 17 (Amazon Corretto)

Setup Instructions
1. Clone the Repository
bash
Copy
Edit
git clone https://github.com/AishwaryMishra9/FUTURE_AISH_FS_01.git
2. Navigate to the Project Directory
bash
Copy
Edit
cd spring-portfolio-website
3. Set Up the Database
Create a new MySQL database.

Use the provided SQL scripts (found in the sql-scripts-samples directory) to create tables and insert sample data.

Update your application.properties file with database credentials:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password
4. Build the Project
bash
Copy
Edit
mvn clean install
5. Run the Application
bash
Copy
Edit
mvn spring-boot:run
Usage
Open your browser and navigate to:

arduino
Copy
Edit
http://localhost:8080
Use the admin dashboard (accessible from the navigation menu) to manage:

Projects

Skills

Education

Work Experience

Messages

Changes made via the admin panel are reflected dynamically on the website.
