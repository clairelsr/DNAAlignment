# DNAAlignment


Read me

Task1
naive(String a, String b)
Input : 2 séquences de type string (a et b)
Output : entier = taille d’une plus longue sous-séquence de a et b 

Task2
dynamic(String a, String b)
Intput : 2 séquences de type string (a et b)
Output : entier = taille d’une plus longue sous-séquence de a et b 

Task3 
alignement(String a, String b)
Intput : 2 séquences de type string (a et b)
Output : un tableau de String à deux lignes qui représente l’alignement entre a et b 
==> 1ère ligne est la séquence de a modifié (caractères de a et hyphens) 
==> 2ème ligne est la séquence de b modifié (caractères de a et hyphens)

Task4
Score(String a, String b)
Intput : 2 séquences de type string (a et b)
Output : un tableau de String à deux lignes qui représente l’alignement entre a et b 
==> 1ère ligne est la séquence de a modifié (caractères de a et hyphens) 
==> 2ème ligne est la séquence de b modifié (caractères de a et hyphens)

Task5
ScorePenalty(String a, String b, int incr, int open)
Input : 
==> 2 séquences de type string (a et b)
==> les pénalités d’ajout et de début de délétion/insertion
* incr = 1
* open = 5
Output : un tableau de String à deux lignes qui représente l’alignement entre a et b 
==> 1ère ligne est la séquence de a modifié (caractères de a et hyphens) 
==> 2ème ligne est la séquence de b modifié (caractères de a et hyphens)


Task6
LocalAlignment (String a, String b, int incr, int open)
Input : 
==> 2 séquences de type string (a et b)
==> les pénalités d’ajout et de début de délétion/insertion
* incr = 1
* open = 5
Output : un tableau de String à deux lignes qui représente l’alignement local optimal entre a et b 
==> 1ère ligne est la séquence de a modifié (caractères de a et hyphens) 
==> 2ème ligne est la séquence de b modifié (caractères de a et hyphens)

LocalAlignment2 (String a, String b, int incr, int open) -> meilleur en terme de complexité spatiale 
Input : 
==> 2 séquences de type string (a et b)
==> les pénalités d’ajout et de début de délétion/insertion. 
Output : un tableau de String à deux lignes qui représente l’alignement local optimal entre a et b 
==> 1ère ligne est la séquence de a modifié (caractères de a et hyphens) 
==> 2ème ligne est la séquence de b modifié (caractères de a et hyphens)

Task7 
Fonctions intermédiaires : 
retournarbre(String  g, int k)
Input : séquence g de type string et la taille k des sous-mots de g (4 typiquement)
Output : un arbre (défini dans la classe arbre.java) 

getscore2mots (String motg, String mott)
Intput : 2 séquences de type string (motg et mott)
Output : le score de leur alignement (sans hyphen)

estdansSg(String tk, arbre g,float th, float score, float autoscore,boolean res)
Input : 
==> une séquence tk de type string
==> un arbre (défini dans la classe arbre.java)g de hauteur la taille de tk 
==> 3 flottants : 
* th =0,1 typiquement
* score=0 et il s’incrémente dans la fonciton
* autoscore=score de tk avec lui-même
==> un booléen res (=false)
Output : un booléen qui vaut true si tk est dans Sg 

Algorithme principal 
indices (String g, String t, float th,int k )
Input : 
==> 2 séquences de type string (g et t)
==> 1 flottant th = 0.9 typiquement
==> 1 entier k qui définit la taille des sous mots de k (4 typiquement)
Output :  indices de t de commencement de « perfect matching » sous forme de liste chainée 

Task8
retournarbrebis(String g, int k)
Input : séquence g de type string et la taille k des sous-mots de g (4 typiquement)
Output : un arbrebis (défini dans la classe arbrebis.java) 

estdansSgbis(String tk, arbrebis g,float th, float score,float autoscore)
Input : 
==> une séquence tk de type string
==> un arbrebis (défini dans la classe arbrebis.java)g de hauteur la taille de tk 
==> 3 flottants : 
* th =0,1 typiquement
* score=0 et il s’incrémente dans la fonciton
* autoscore=score de tk avec lui-même
Output : indices de g qui ou le sous-mot de g de taille k (=taille (tk)) a un « perfect matching » avec tk 

correspondance (String g, String t, float th,int k)
Input : 
==> 2 séquences g et t sous forme de String 
==> 1 flottants th =0,1 typiquement
==> Un entier k de la taille des sous mots de g =4 typiquement
Out put : un dictionnaire sous forme de Hasmap entre les indices de t et la liste d’indices de g de telle sorte que les sous-mots (qui commencent en une clé sur t, et en un indice de la valeur associée à la clé sur g) ont un perfect matching

AlignementScore (String g, String t, int gaucheg, int droiteg, int gauchet, int droitet)
Input 
==> 2 séquences g et t sous forme de String 
==> 4 entiers qui fixent les limites des sous-mots
Output : le score de l’alignement 

alignements (String g, String t, float th,int k, float thl)
Input 
==> 2 séquences g et t sous forme de String 
==> 1 flottants th =0,1 typiquement
==> Un entier k de la taille des sous mots de g =4 typiquement
==> 1 flottant = 0.1 typiquement 
Output : un dictionnaire de type Hashmap entre les indices de t et la liste d’alignements (au sens de la classe alignement.java) de telle sorte que le score de l’alignement >= thl*score de l’alignement de g avec lui-même.

Fonctions utilitaires 
printalignements (String g, String t, float th,int k, float thl)
input : 
==> 2 séquences g et t sous forme de String 
==> 1 flottants th =0,1 typiquement
==> Un entier k de la taille des sous mots de g =4 typiquement
==> 1 flottant = 0.1 typiquement 
Output : Une phrase de présentation de tous les alignements locaux entre g et t qui vérifient les confitions de la task8. 

printcorrespondance (HashMap<Integer, LinkedList<Integer>> correspondance)
Input : un dictionnaire de correspondances
Output : Une phrase de présentation de toutes les correspondances du dictionnaire mis en paramètre 

printliste (LinkedList<Integer> L)
Input : une liste d’entiers L 
Output : Une phrase qui liste les entiers de L 

