Controller 
* Håndter HTTP requests, map til de rigtige service metoder 
* Definer end points (URL) for API 
* Input validering før det sendes til service modul 
* Dvs. mapping foregår her, ikke i Service 

Service 
* Forretningslogik: de faktiske operationer, herunder databaseforespørgsler, håndtering af data. 
* Testbart, hvor der ikke er brug for HTTP, nemmere at isolere forretningslogikken 
* Modularity: Koden kan anvendes i andre services og controllere

