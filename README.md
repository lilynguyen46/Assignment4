### CSC 340 - Assignment 4 CRUD API
## API Endpoints
Base URL: http://localhost:8080/animals
## /all (GET)
Get a list of all animals in the database
# Response
```
[
 {
   "id": 1,
   "animal_name": "Tiger",
   "description": "Black, orange and white striped animal.",
   "lifespan": 13,
   "origin": "Asia"
 },
 {
   "id": 2,
   "animal_name": "Panda",
   "description": "White and black type bear.",
   "lifespan": 20,
   "origin": "Asia"
 }
 {
   "id": 3,
   "animal_name": "Giraffe",
   "description": "The tallest land animals, distinguished by their exceptionally long necks and legs, spotted coats, and short body.",
   "lifespan": 23,
   "origin": "Asia"
 }
]
```
## /{id} (GET)
Gets an individual animal by id.
# Response
```
{
   "id": 1,
   "animal_name": "Tiger",
   "description": "Black, orange and white striped animal.",
   "lifespan": 13,
   "origin": "Asia"
}
```
## /animalname (GET)
Gets animal by name.
# Response
```
 {
   "id": 2,
   "animal_name": "Panda",
   "description": "White and black type bear.",
   "lifespan": 20,
   "origin": "Asia"
 }
```
 ## /animalorigin (GET)
 Gets animals by origin.
 # Response 
 ```
  {
   "id": 1,
   "animal_name": "Tiger",
   "description": "Black, orange and white striped animal.",
   "lifespan": 13,
   "origin": "Asia"
 },
 {
   "id": 2,
   "animal_name": "Panda",
   "description": "White and black type bear.",
   "lifespan": 20,
   "origin": "Asia"
 }
 {
   "id": 3,
   "animal_name": "Giraffe",
   "description": "The tallest land animals, distinguished by their exceptionally long necks and legs, spotted coats, and short body.",
   "lifespan": 23,
   "origin": "Asia"
 }
```
 ## /lifespan (GET)
 Gets animals by lifespan
 # Response
 ```
  {
   "id": 2,
   "animal_name": "Panda",
   "description": "White and black type bear.",
   "lifespan": 20,
   "origin": "Asia"
 }
```
 ## /new (POST)
 Create a new animal.
 # Response
 ```
{
  "animal_name": "Cat",
  "description": "Cats, or Felis catus, are small, furry, carnivorous mammals known for their playful and curious nature, characterized by retractable claws, acute senses, and specialized teeth for hunting. ",
  "lifespan": 20,
  "origin": "Africa"
}

# Response
[
 {
   "id": 1,
   "animal_name": "Tiger",
   "description": "Black, orange and white striped animal.",
   "lifespan": 13,
   "origin": "Asia"
 },
 {
   "id": 2,
   "animal_name": "Panda",
   "description": "White and black type bear.",
   "lifespan": 20,
   "origin": "Asia"
 }
 {
   "id": 3,
   "animal_name": "Giraffe",
   "description": "The tallest land animals, distinguished by their exceptionally long necks and legs, spotted coats, and short body.",
   "lifespan": 23,
   "origin": "Asia"
 }
 {
   "id": 4,
  "animal_name": "Cat",
  "description": "Cats, or Felis catus, are small, furry, carnivorous mammals known for their playful and curious nature, characterized by retractable claws, acute senses, and specialized teeth for hunting. ",
  "lifespan": 20,
  "origin": "Africa"
}
]
```
## /update/{id} (PUT)
Update existing animal.
Need integer for id 
# Response 
```
{
  "animal_name": "Cat",
  "description": "Cats, or Felis catus, are small, furry, carnivorous mammals known for their playful and curious nature, characterized by retractable claws, acute senses, and specialized teeth for hunting. ",
  "lifespan": 20,
  "origin": "Asia"
}

# Response

{
   "id": 4,
  "animal_name": "Cat",
  "description": "Cats, or Felis catus, are small, furry, carnivorous mammals known for their playful and curious nature, characterized by retractable claws, acute senses, and specialized teeth for hunting. ",
  "lifespan": 20,
  "origin": "Asia"
}
```
## /delete/{id} (DELETE)
Delete an animal.
Need integer for id.

# Response
```
Updated list

[
 {
   "id": 1,
   "animal_name": "Tiger",
   "description": "Black, orange and white striped animal.",
   "lifespan": 13,
   "origin": "Asia"
 },
 {
   "id": 2,
   "animal_name": "Panda",
   "description": "White and black type bear.",
   "lifespan": 20,
   "origin": "Asia"
 }
 {
   "id": 3,
   "animal_name": "Giraffe",
   "description": "The tallest land animals, distinguished by their exceptionally long necks and legs, spotted coats, and short body.",
   "lifespan": 23,
   "origin": "Asia"
 }
]
```

