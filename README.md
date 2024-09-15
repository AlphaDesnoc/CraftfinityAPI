# Documentation de l'API CraftFinity

## URL de base
Toutes les requêtes API sont effectuées vers : `http://localhost:8080/api`

## Points d'accès (Endpoints)

### Joueurs
- **GET** `/infinity/players` - Récupérer tous les joueurs
- **POST** `/infinity/players` - Créer un nouveau joueur
- **GET** `/infinity/players/{id}` - Récupérer un joueur spécifique
- **PUT** `/infinity/players/{id}` - Mettre à jour un joueur spécifique
- **DELETE** `/infinity/players/{id}` - Supprimer un joueur spécifique

### Rangs
- **GET** `/infinity/ranks` - Récupérer tous les rangs
- **POST** `/infinity/ranks` - Créer un nouveau rang
- **GET** `/infinity/ranks/{id}` - Récupérer un rang spécifique
- **PUT** `/infinity/ranks/{id}` - Mettre à jour un rang spécifique
- **DELETE** `/infinity/ranks/{id}` - Supprimer un rang spécifique

### Types de jeux
- **GET** `/gametype` - Récupérer tous les types de jeux
- **POST** `/gametype` - Créer un nouveau type de jeu
- **GET** `/gametype/{id}` - Récupérer un type de jeu spécifique
- **PUT** `/gametype/{id}` - Mettre à jour un type de jeu spécifique
- **DELETE** `/gametype/{id}` - Supprimer un type de jeu spécifique

### Permissions de groupe
- **GET** `/grouppermission` - Récupérer toutes les permissions de groupe
- **POST** `/grouppermission` - Créer une nouvelle permission de groupe
- **GET** `/grouppermission/{id}` - Récupérer une permission de groupe spécifique
- **PUT** `/grouppermission/{id}` - Mettre à jour une permission de groupe spécifique
- **DELETE** `/grouppermission/{id}` - Supprimer une permission de groupe spécifique

### Amis
- **GET** `/infinity/friend` - Récupérer tous les amis
- **POST** `/infinity/friend` - Créer une nouvelle relation d'amitié
- **GET** `/infinity/friend/{id}` - Récupérer une relation d'amitié spécifique
- **PUT** `/infinity/friend/{id}` - Mettre à jour une relation d'amitié spécifique
- **DELETE** `/infinity/friend/{id}` - Supprimer une relation d'amitié spécifique

### Jeux
- **GET** `/infinity/game` - Récupérer tous les jeux
- **POST** `/infinity/game` - Créer un nouveau jeu
- **GET** `/infinity/game/{id}` - Récupérer un jeu spécifique
- **PUT** `/infinity/game/{id}` - Mettre à jour un jeu spécifique
- **DELETE** `/infinity/game/{id}` - Supprimer un jeu spécifique

### Groupes
- **GET** `/infinity/group` - Récupérer tous les groupes
- **POST** `/infinity/group` - Créer un nouveau groupe
- **GET** `/infinity/group/{id}` - Récupérer un groupe spécifique
- **PUT** `/infinity/group/{id}` - Mettre à jour un groupe spécifique
- **DELETE** `/infinity/group/{id}` - Supprimer un groupe spécifique

### Monnaie
- **GET** `/infinity/money` - Récupérer tous les enregistrements de monnaie
- **POST** `/infinity/money` - Créer un nouvel enregistrement de monnaie
- **GET** `/infinity/money/{id}` - Récupérer un enregistrement de monnaie spécifique
- **PUT** `/infinity/money/{id}` - Mettre à jour un enregistrement de monnaie spécifique
- **DELETE** `/infinity/money/{id}` - Supprimer un enregistrement de monnaie spécifique

### Permissions
- **GET** `/infinity/permission` - Récupérer toutes les permissions
- **POST** `/infinity/permission` - Créer une nouvelle permission
- **GET** `/infinity/permission/{id}` - Récupérer une permission spécifique
- **PUT** `/infinity/permission/{id}` - Mettre à jour une permission spécifique
- **DELETE** `/infinity/permission/{id}` - Supprimer une permission spécifique

### Groupes de joueurs
- **GET** `/player/groups` - Récupérer toutes les associations joueur-groupe
- **POST** `/player/groups` - Créer une nouvelle association joueur-groupe
- **GET** `/player/groups/{id}` - Récupérer une association joueur-groupe spécifique
- **PUT** `/player/groups/{id}` - Mettre à jour une association joueur-groupe spécifique
- **DELETE** `/player/groups/{id}` - Supprimer une association joueur-groupe spécifique

### Monnaie des joueurs
- **GET** `/player/money` - Récupérer tous les enregistrements de monnaie des joueurs
- **POST** `/player/money` - Créer un nouvel enregistrement de monnaie pour un joueur
- **GET** `/player/money/{id}` - Récupérer un enregistrement de monnaie spécifique d'un joueur
- **PUT** `/player/money/{id}` - Mettre à jour un enregistrement de monnaie spécifique d'un joueur
- **DELETE** `/player/money/{id}` - Supprimer un enregistrement de monnaie spécifique d'un joueur

### Paramètres des joueurs
- **GET** `/player/parameter` - Récupérer tous les paramètres des joueurs
- **POST** `/player/parameter` - Créer un nouveau paramètre pour un joueur
- **GET** `/player/parameter/{id}` - Récupérer un paramètre spécifique d'un joueur
- **PUT** `/player/parameter/{id}` - Mettre à jour un paramètre spécifique d'un joueur
- **DELETE** `/player/parameter/{id}` - Supprimer un paramètre spécifique d'un joueur

### Permissions des joueurs
- **GET** `/player/permission` - Récupérer toutes les permissions des joueurs
- **POST** `/player/permission` - Créer une nouvelle permission pour un joueur
- **GET** `/player/permission/{id}` - Récupérer une permission spécifique d'un joueur
- **PUT** `/player/permission/{id}` - Mettre à jour une permission spécifique d'un joueur
- **DELETE** `/player/permission/{id}` - Supprimer une permission spécifique d'un joueur

### Parties jouées par les joueurs
- **GET** `/player/playedgame` - Récupérer toutes les parties jouées
- **POST** `/player/playedgame` - Créer un nouvel enregistrement de partie jouée
- **GET** `/player/playedgame/{id}` - Récupérer un enregistrement spécifique de partie jouée
- **PUT** `/player/playedgame/{id}` - Mettre à jour un enregistrement spécifique de partie jouée
- **DELETE** `/player/playedgame/{id}` - Supprimer un enregistrement spécifique de partie jouée

## Remarques
- Remplacez `{id}` dans les URLs par l'ID réel de la ressource avec laquelle vous interagissez.
- Pour les requêtes POST et PUT, vous devrez envoyer les données appropriées dans le corps de la requête.
- Assurez-vous d'avoir l'authentification et l'autorisation nécessaires pour accéder à ces points d'accès.