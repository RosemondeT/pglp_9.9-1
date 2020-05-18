## pglp_9.9 `LOGICIEL DE DESSIN`
Ce projet a pour but de permettre � l'�tudiant de savoir impl�menter les principes de conception ainsi que les fonctionnalit�s du langage java.

Le logiciel devra permettre de :

* Chaque forme sera identifi�e par un nom ("c1", "unCercle", ...).

* L'application permettra de manipuler des cercles, des rectangles, des carr�s et des triangles.

* Chaque forme devra pouvoir �tre affich�e et d�plac�e.

* Les formes devront pouvoir �tre regroup�es et pourront subir des traitements globaux comme par exemple d�placer ensemble un cercle et un triangle.

* Un dessin (ensemble de formes) pourra �tre sauvegard�/charg� dans un SGBD embarqu� 

<hr>

#### 1. Proposons et impl�mentons une hi�rarchie de classe repr�sentant les formes graphiques
Pour cette partie, Nous avons cr�e une interface Forme qui sera impl�ment�e par toutes les formes � mettre en place: le carr�, le cercle, le rectangle et le triangle

<hr>

#### 2. Repr�sentons la notion de groupe de formes en appliquant le pattern `Composite`
La classe FormeGroup qui impl�mentera l'interface Forme permettra de pouvoir effectuer un ensemble de manipulation (deplacer , afficher toutes les formes du groupes suivant un param�tre donn�) sur un groupe de forme (Carre, cercle, rectangle, triangle) donn�. 

<hr>

#### 3. Render les formes et les groupes persistants en utilisant le pattern `DAO` et `JDBC`
Cette partie a pour but de mettre en place la base de donn�es du logiciel. Sur cette base de donn�es pourra etre effectuer les op�rations comme l'ajout d'une nouvelle forme (carre, rectangle, cercle,triangle), la mise � jour (d�placer), la recherche.....

* Pour se faire nous avons du utiliser un SGBD embarqu�, DERBY (qui est assez facile d'ulisation pour la mise  en place d'application de ce genre).

* Une classe a �t� cr�e pour l'�tablissement de la connexion vers la base de donn�es. Elle contient la m�thode connexion qui d�crit les param�tres � utiliser pour se connecter ainsi que les m�thodes de cr�ation et de suppression des classes sp�cifiques. 

* Pour chaque forme, une classe DAO a cr�e. Cette classe contient les m�thodes de connexion � la base de donn�es, de creation d'une nouvelle figure sp�cifique, de suppreesion, de mise � jour et de recherche suivant des param�tres sp�cifiques � renseigner.

<hr>

#### 4. R�aliser la classe `DrawingTUI` qui se chargera des interactions avec l�utilisateur

Pour interragir avec le logiciel, cette classe a �t� mise en place. Elle a pour but d'analyser les informations saisies par l'utlisateur, de d�tecter la forme demand�e par l'utilisateur et de verifier les erreurs de saisies � travers sa m�thode nextCommand et la classe Interpreteur. Elle permet egalement d'afficher une forme d�mand�e grace � sa m�thode Print.
Elle communique avec la classe `DrawingApp` qui contient la m�thode main, m�thode qui permet d'ex�cuter le logiciel.

<hr>

#### 5. Impl�mentation des commandes suivant le mod�le de coneception `Commande`
Pour mettre en place cette structure, nous avons cr�e une interface command qui � son tour impl�mente toutes les commandes mises en places. Chaque action repr�sente une classe, dans laquelle est d�crit comment elle est cenc�e se derouler et quelles param�tres elle est cenc� l'impl�ment�.
Ainsi pour chaque commande saisie un ensembles de verification sont fait d'abord sur la d�tection de la forme � cr�� � travers la classe CreateCommande puis en fonction de chaque orme des v�rifications sont effectu�es.,

<hr>

### COMMENT FONCTIONNE LE LOGICIEL ?????



