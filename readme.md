Om projektet
-
Kort sagt: 

Projekt fra CodeCademy om en platform, der hjælper folk med fødevareallergier med at finde restauranter

Mål for projektet
* Bygge en simpel backend med Spring Boot og H2 database, der håndterer brugere, restauranter og anmeldelser.
* Brugere skal kunne oprette en profil og angive, om de har allergier (peanuts, æg og mælk).
* Restauranter får anmeldelser, hvor brugerne kan give en allergivenlig score baseret på deres oplevelsen eller menuen generelt. 
* Systemet skal kunne beregne gennemsnitlige allergivenlige scores for restauranter, så andre brugere nemt kan se, om de kan spise der med deres allergier. 
* API’en skal kunne returnere data, så der senere kan laves noget frontend, formentlig med React eller Angular. 
* Fokus på simpelt design, hvor flere features kan tilføjes senere.

Noter undervejs: 
-
Controller
* Håndter HTTP requests, map til de rigtige service metoder 
* Definer end points (URL) for API 
* Input validering før det sendes til service modul 
* Dvs. mapping foregår her, ikke i Service 
* Returner ResponseEntity, så vi kan håndtere de rigtige HTTP koder 

Service 
* Forretningslogik: de faktiske operationer, herunder databaseforespørgsler, håndtering af data. 
* Testbart, hvor der ikke er brug for HTTP, nemmere at isolere forretningslogikken 
* Modularity: Koden kan anvendes i andre services og controllere
* Returner Optionals 

Repository 
* Returner Optionals 

Entities og hvad metoderne bør returnere 
* Repository: findById: returner optional 
* Service: findById: returner optional, exception 
* Controller: create: returner response entity m. HTTP status 

DTO (Data Transfer Object)
* I stedet for at returnere "hele" objekter, fx User med al data, kan der vælges enkelte data, som vi ønsker at vise brugeren. 
<<<<<<< HEAD

Todos
-
* ResponseEntity som retur i controllere 
* Resterende HTTP metoder i alle controllere
* Andre funktionaliteter? 
=======

