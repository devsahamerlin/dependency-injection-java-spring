# 1. Créer l'interface IDao avec une méthode getData

![IDao.png](images/IDao.png)

# 2. Créer une implémentation de cette interface

![DaoImpl.png](images/DaoImpl.png)

# 3. Créer l'interface IMetier avec une méthode calcul

![IMetier.png](images/IMetier.png)

# 4. Créer une implémentation de cette interface en utilisant le couplage faible

![MetierImpl.png](images/MetierImpl.png)

# 5. Faire l'injection des dépendances :
   ## a. Par instanciation statique

![ instanciation statique-1.png](images/%20instanciation%20statique-1.png)

![ instanciation statique-2.png](images/%20instanciation%20statique-2.png)

   ## b. Par instanciation dynamique

![Instantiation dynamique.png](images/Instantiation%20dynamique.png)

   ## c. En utilisant le Framework Spring
   ### - Version XML

   #### - Base de données

   ![instanciation utilisant le Framework Spring Version XML - V1-1.png](images/instanciation%20utilisant%20le%20Framework%20Spring%20Version%20XML%20-%20V1-1.png)
   
   ![instanciation utilisant le Framework Spring Version XML - V1-2.png](images/instanciation%20utilisant%20le%20Framework%20Spring%20Version%20XML%20-%20V1-2.png)

   #### - V2 Capteurs

   ![instanciation utilisant le Framework Spring Version XML - V2.png](images/instanciation%20utilisant%20le%20Framework%20Spring%20Version%20XML%20-%20V2.png)

   ### - Version annotations
    
   #### - Version annotations Avec Contructeur
    
   ![instanciation  En utilisant le Framework Spring - constructeur.png](images/instanciation%20%20En%20utilisant%20le%20Framework%20Spring%20-%20constructeur.png)

   #### - Version annotations Avec Autowired

   ![instanciation En utilisant le Framework Spring - autowired.png](images/instanciation%20En%20utilisant%20le%20Framework%20Spring%20-%20autowired.png)
    