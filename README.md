# 🚗 AutoLoc

## 📌 Présentation

**AutoLoc** est une application de gestion de location de véhicules développée avec **Spring Boot**.

Elle permet de centraliser la gestion des agences de location, des véhicules, des clients, des employés, des réservations, des contrats, des paiements, des équipements et des opérations de maintenance.

L'objectif est de faciliter la gestion d'une agence de location automobile à travers une application structurée et évolutive.

---

## 🎯 Fonctionnalités principales

AutoLoc permet de gérer :

- 🏢 Les agences
- 🚘 Les véhicules
- 👤 Les clients
- 👨‍💼 Les employés
- 📅 Les réservations
- 📄 Les contrats de location
- 💳 Les paiements
- 🔧 Les opérations de maintenance
- 🧰 Les équipements des véhicules

---

## 🧩 Entités du projet

Le projet contient les principales entités suivantes :

- `Agence`
- `Vehicule`
- `Client`
- `Employe`
- `Reservation`
- `Contrat`
- `Paiement`
- `Equipement`
- `Maintenance`

Des énumérations sont également utilisées pour représenter certaines informations comme :

- la catégorie du véhicule ;
- le statut du véhicule ;
- le statut d'une réservation ;
- le rôle d'un employé ;
- le mode de paiement.

---

## 🔗 Relations entre les entités

Le modèle de données contient plusieurs types d'associations JPA.

### Agence - Employe

Une agence peut avoir plusieurs employés et un employé appartient à une agence.

`OneToMany / ManyToOne`

### Agence - Vehicule

Une agence peut gérer plusieurs véhicules et un véhicule appartient à une agence.

`OneToMany / ManyToOne`

### Vehicule - Equipement

Un véhicule peut avoir plusieurs équipements et un équipement peut être associé à plusieurs véhicules.

`ManyToMany`

### Client - Reservation

Un client peut effectuer plusieurs réservations et une réservation appartient à un client.

`OneToMany / ManyToOne`

### Vehicule - Reservation

Un véhicule peut être associé à plusieurs réservations.

`OneToMany / ManyToOne`

### Reservation - Contrat

Une réservation est associée à un contrat.

`OneToOne`

### Contrat - Paiement

Un contrat peut être associé à plusieurs paiements.

`OneToMany / ManyToOne`

### Maintenance - Vehicule

Une opération de maintenance concerne un véhicule.

`ManyToOne`

---

## 🛠️ Technologies utilisées

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **Maven**
- **Lombok**
- **MySQL**
- **phpMyAdmin**
- **IntelliJ IDEA**
- **Git**
- **GitHub**

---

## 🗄️ Base de données

L'application utilise une base de données **MySQL**.

La persistance des données et les relations entre les différentes entités sont gérées avec **Spring Data JPA et Hibernate**.

Une table de jointure `vehicule_equipement` est utilisée pour représenter la relation `ManyToMany` entre les véhicules et les équipements.

---

## 📁 Structure du projet

```text
FirstProject
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── tn.esprit.firstproject
│   │   │       ├── FirstProjectApplication.java
│   │   │       │
│   │   │       └── entities
│   │   │           ├── Agence.java
│   │   │           ├── Client.java
│   │   │           ├── Contrat.java
│   │   │           ├── Employe.java
│   │   │           ├── Equipement.java
│   │   │           ├── Maintenance.java
│   │   │           ├── Paiement.java
│   │   │           ├── Reservation.java
│   │   │           └── Vehicule.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│
└── pom.xml
```

---

## 👩‍💻 Auteur

**Yassmine Saidi**  
**4ème Actuariat**