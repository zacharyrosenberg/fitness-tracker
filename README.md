# Fitness Tracker

A full-stack fitness tracking application that helps users monitor their workouts, daily activities, and fitness goals. The application provides a dashboard with visual analytics to track progress over time.

## Features

- **Activity Tracking:** Log daily activities including steps, distance, and calories burned
- **Workout Management:** Record and manage workout sessions with duration and calories burned
- **Goal Setting:** Set personal fitness goals and track progress
- **Dashboard Analytics:** Visualize your fitness data with interactive charts and statistics
- **Responsive Design:** Works across desktop and mobile devices

## Tech Stack

### Backend

- **Java 17**
- **Spring Boot 3.3.10**
- **Spring Data JPA** for database operations
- **MySQL** for data persistence
- **Maven** for dependency management and build

### Frontend

- **Angular 19**
- **TypeScript**
- **Chart.js** for data visualization
- **NG-ZORRO** for UI components
- **RxJS** for reactive programming

## Project Structure

```
fitness-tracker/
├── backend/                  # Spring Boot backend application
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/zrosen10/fitnessTracker/
│   │   │   │       ├── controller/  # REST endpoints
│   │   │   │       ├── dto/         # Data Transfer Objects
│   │   │   │       ├── entity/      # JPA entities
│   │   │   │       ├── repository/  # Data access layer
│   │   │   │       ├── services/    # Business logic
│   │   │   └── resources/           # Configuration files
│   └── pom.xml                      # Maven configuration
└── frontend/                        # Angular frontend application
    └── fitnessWeb/
        ├── src/
        │   ├── app/
        │   │   ├── components/      # Angular components
        │   │   ├── service/         # API services
        │   │   └── shared/          # Shared modules
        │   ├── assets/              # Static resources
        │   └── environments/        # Environment configurations
        └── package.json             # npm configuration
```

## Getting Started

### Prerequisites

- Java 17 or later
- Node.js 18 or later
- npm 8 or later
- MySQL 8.0 or later

### Backend Setup

1. Navigate to the backend directory:

   ```
   cd backend
   ```

2. Configure MySQL database in `src/main/resources/application.properties`.

3. Build and run the application:

   ```
   ./mvnw spring-boot:run
   ```

   The backend API will be available at http://localhost:8080.

### Frontend Setup

1. Navigate to the frontend directory:

   ```
   cd frontend/fitnessWeb
   ```

2. Install dependencies:

   ```
   npm install
   ```

3. Start the development server:

   ```
   npm start
   ```

   The application will be available at http://localhost:4200.

## API Endpoints

- `/api/activities` - Manage user activities
- `/api/workouts` - Manage user workouts
- `/api/goals` - Manage user fitness goals
- `/api/stats` - Get user statistics
- `/api/graphs` - Get data for dashboard graphs

## Future Enhancements

- User authentication and personalized profiles
- Social features for sharing achievements
- Integration with fitness wearables
- Nutrition tracking
- Advanced analytics and personalized recommendations

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgements

- [Chart.js](https://www.chartjs.org/) for the interactive charts
- [NG-ZORRO](https://ng.ant.design/docs/introduce/en) for the UI components
- Spring Boot team for the excellent backend framework
- Angular team for the powerful frontend framework
