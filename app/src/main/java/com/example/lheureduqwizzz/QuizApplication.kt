package com.example.lheureduqwizzz

import android.app.Application
import com.example.lheureduqwizzz.data.Question
import com.example.lheureduqwizzz.data.QuizDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuizApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val database = QuizDatabase.getDatabase(this)
        val questionDao = database.questionDao()

        CoroutineScope(Dispatchers.IO).launch {
            questionDao.insert(Question(question = "Quelle est la capitale de la France?", option1 = "Berlin", option2 = "Madrid", option3 = "Paris", option4 = "Rome", answerNr = 3))
            questionDao.insert(Question(question = "Combien de continents y a-t-il dans le monde?", option1 = "5", option2 = "6", option3 = "7", option4 = "8", answerNr = 3))
            questionDao.insert(Question(question = "Quel est le plus grand océan du monde?", option1 = "Océan Atlantique", option2 = "Océan Indien", option3 = "Océan Arctique", option4 = "Océan Pacifique", answerNr = 4))
            questionDao.insert(Question(question = "Quel est le symbole chimique de l'eau?", option1 = "H2O", option2 = "O2", option3 = "CO2", option4 = "H2", answerNr = 1))
            questionDao.insert(Question(question = "Qui a peint la Joconde?", option1 = "Vincent van Gogh", option2 = "Pablo Picasso", option3 = "Léonard de Vinci", option4 = "Claude Monet", answerNr = 3))
            questionDao.insert(Question(question = "Quelle est la monnaie officielle du Japon?", option1 = "Yuan", option2 = "Won", option3 = "Yen", option4 = "Dollar", answerNr = 3))
            questionDao.insert(Question(question = "En quelle année l'homme a-t-il marché sur la lune?", option1 = "1965", option2 = "1969", option3 = "1972", option4 = "1975", answerNr = 2))
            questionDao.insert(Question(question = "Quel est le plus grand désert du monde?", option1 = "Désert de Gobi", option2 = "Désert du Sahara", option3 = "Désert d'Arabie", option4 = "Désert de l'Antarctique", answerNr = 4))
            questionDao.insert(Question(question = "Quelle est la planète la plus proche du soleil?", option1 = "Venus", option2 = "Terre", option3 = "Mercure", option4 = "Mars", answerNr = 3))
            questionDao.insert(Question(question = "Qui a écrit 'Roméo et Juliette'?", option1 = "Charles Dickens", option2 = "William Shakespeare", option3 = "Mark Twain", option4 = "Jane Austen", answerNr = 2))
            questionDao.insert(Question(question = "Quel est le plus grand mammifère terrestre?", option1 = "Éléphant", option2 = "Baleine bleue", option3 = "Rhinocéros", option4 = "Girafe", answerNr = 1))
            questionDao.insert(Question(question = "Quel est l'élément chimique dont le symbole est Fe?", option1 = "Fluor", option2 = "Fer", option3 = "Francium", option4 = "Phosphore", answerNr = 2))
            questionDao.insert(Question(question = "Qui a inventé l'ampoule électrique?", option1 = "Alexander Graham Bell", option2 = "Nikola Tesla", option3 = "Thomas Edison", option4 = "Isaac Newton", answerNr = 3))
            questionDao.insert(Question(question = "Quel est le pays le plus peuplé du monde?", option1 = "Inde", option2 = "États-Unis", option3 = "Chine", option4 = "Brésil", answerNr = 3))
            questionDao.insert(Question(question = "Quelle est la langue officielle du Brésil?", option1 = "Espagnol", option2 = "Anglais", option3 = "Portugais", option4 = "Français", answerNr = 3))
            questionDao.insert(Question(question = "Quel est le plus long fleuve du monde?", option1 = "Fleuve Amazone", option2 = "Fleuve Mississippi", option3 = "Nil", option4 = "Yangtsé", answerNr = 1))
            questionDao.insert(Question(question = "Quelle est la capitale de l'Australie?", option1 = "Sydney", option2 = "Melbourne", option3 = "Canberra", option4 = "Perth", answerNr = 3))
            questionDao.insert(Question(question = "Quelle est la durée d'un match de football?", option1 = "90 minutes", option2 = "60 minutes", option3 = "45 minutes", option4 = "120 minutes", answerNr = 1))
            questionDao.insert(Question(question = "Quelle est la capitale du Canada?", option1 = "Toronto", option2 = "Vancouver", option3 = "Montréal", option4 = "Ottawa", answerNr = 4))
            questionDao.insert(Question(question = "Quel est le symbole chimique de l'or?", option1 = "Au", option2 = "Ag", option3 = "Pb", option4 = "Fe", answerNr = 1))
            questionDao.insert(Question(question = "Qui a écrit 'Les Misérables'?", option1 = "Victor Hugo", option2 = "Émile Zola", option3 = "Honoré de Balzac", option4 = "Albert Camus", answerNr = 1))
            questionDao.insert(Question(question = "Quel est le plus petit pays du monde?", option1 = "Monaco", option2 = "Liechtenstein", option3 = "Saint-Marin", option4 = "Vatican", answerNr = 4))
            questionDao.insert(Question(question = "Qui a découvert l'Amérique?", option1 = "Marco Polo", option2 = "Ferdinand Magellan", option3 = "Christophe Colomb", option4 = "Amerigo Vespucci", answerNr = 3))
            questionDao.insert(Question(question = "Quel est le plus grand organe du corps humain?", option1 = "Cœur", option2 = "Foie", option3 = "Peau", option4 = "Poumon", answerNr = 3))
            questionDao.insert(Question(question = "Quelle est la première lettre de l'alphabet grec?", option1 = "Alpha", option2 = "Beta", option3 = "Gamma", option4 = "Delta", answerNr = 1))
            questionDao.insert(Question(question = "Quel est le plus haut sommet du monde?", option1 = "Mont Everest", option2 = "Mont Kilimandjaro", option3 = "Mont K2", option4 = "Mont Elbrouz", answerNr = 1))
            questionDao.insert(Question(question = "Quelle est la distance approximative entre la Terre et le Soleil?", option1 = "150 000 km", option2 = "1 500 000 km", option3 = "15 000 000 km", option4 = "150 000 000 km", answerNr = 4))
            questionDao.insert(Question(question = "Qui a peint 'Le Cri'?", option1 = "Vincent van Gogh", option2 = "Edvard Munch", option3 = "Pablo Picasso", option4 = "Claude Monet", answerNr = 2))
            questionDao.insert(Question(question = "Quelle est la formule chimique du dioxyde de carbone?", option1 = "CO", option2 = "CO2", option3 = "C2O", option4 = "C2O2", answerNr = 2))
            questionDao.insert(Question(question = "Quel est l'auteur de 'L'Iliade' et 'L'Odyssée'?", option1 = "Homère", option2 = "Sophocle", option3 = "Euripide", option4 = "Aristophane", answerNr = 1))
            questionDao.insert(Question(question = "Quel est le plus long fleuve de France?", option1 = "La Seine", option2 = "La Loire", option3 = "Le Rhône", option4 = "La Garonne", answerNr = 2))
            questionDao.insert(Question(question = "Quel est le plus grand océan de la planète?", option1 = "Atlantique", option2 = "Pacifique", option3 = "Indien", option4 = "Arctique", answerNr = 2))
            questionDao.insert(Question(question = "Quel est le plus haut sommet d'Afrique?", option1 = "Mont Kenya", option2 = "Mont Elbrouz", option3 = "Mont Kilimandjaro", option4 = "Mont Atlas", answerNr = 3))
            questionDao.insert(Question(question = "Quel est l'élément chimique dont le symbole est N?", option1 = "Sodium", option2 = "Azote", option3 = "Neon", option4 = "Nickel", answerNr = 2))
            questionDao.insert(Question(question = "Quel pays est surnommé le 'Pays du Soleil Levant'?", option1 = "Chine", option2 = "Corée du Sud", option3 = "Thaïlande", option4 = "Japon", answerNr = 4))
            questionDao.insert(Question(question = "Quel est le plus grand lac d'eau douce du monde?", option1 = "Lac Baïkal", option2 = "Lac Supérieur", option3 = "Lac Victoria", option4 = "Lac Tanganyika", answerNr = 2))
            questionDao.insert(Question(question = "Qui a écrit 'Guerre et Paix'?", option1 = "Fiodor Dostoïevski", option2 = "Léon Tolstoï", option3 = "Anton Tchekhov", option4 = "Vladimir Nabokov", answerNr = 2))
            questionDao.insert(Question(question = "Quel est le plus petit os du corps humain?", option1 = "Stapès", option2 = "Malleus", option3 = "Tibia", option4 = "Fibula", answerNr = 1))
            questionDao.insert(Question(question = "Quel est le pays le plus vaste du monde?", option1 = "Canada", option2 = "États-Unis", option3 = "Chine", option4 = "Russie", answerNr = 4))
            questionDao.insert(Question(question = "Qui a écrit 'Hamlet'?", option1 = "Molière", option2 = "Victor Hugo", option3 = "Jean Racine", option4 = "William Shakespeare", answerNr = 4))
            questionDao.insert(Question(question = "Quel est le plus grand satellite naturel de la Terre?", option1 = "Lune", option2 = "Titan", option3 = "Io", option4 = "Europa", answerNr = 1))
            questionDao.insert(Question(question = "Quel est le plus grand désert chaud du monde?", option1 = "Désert d'Arabie", option2 = "Désert du Sahara", option3 = "Désert de Gobi", option4 = "Désert de Sonora", answerNr = 2))
            questionDao.insert(Question(question = "Quel est le plus grand pays d'Amérique du Sud?", option1 = "Argentine", option2 = "Colombie", option3 = "Brésil", option4 = "Pérou", answerNr = 3))
            questionDao.insert(Question(question = "Quel est le plus haut sommet d'Europe?", option1 = "Mont Blanc", option2 = "Mont Elbrouz", option3 = "Mont Cervin", option4 = "Mont Everest", answerNr = 1))
            questionDao.insert(Question(question = "Quel est le plus long fleuve d'Afrique?", option1 = "Congo", option2 = "Niger", option3 = "Nil", option4 = "Zambèze", answerNr = 3))
            questionDao.insert(Question(question = "Quelle est la monnaie officielle du Royaume-Uni?", option1 = "Euro", option2 = "Dollar", option3 = "Livre sterling", option4 = "Franc suisse", answerNr = 3))
            questionDao.insert(Question(question = "Quel est le plus grand pays de l'Union européenne par sa superficie?", option1 = "France", option2 = "Allemagne", option3 = "Espagne", option4 = "Pologne", answerNr = 1))
            questionDao.insert(Question(question = "Quel est le plus grand lac d'Afrique?", option1 = "Lac Tchad", option2 = "Lac Tanganyika", option3 = "Lac Victoria", option4 = "Lac Malawi", answerNr = 3))
            questionDao.insert(Question(question = "Qui a écrit 'Le Petit Prince'?", option1 = "Jules Verne", option2 = "Victor Hugo", option3 = "Antoine de Saint-Exupéry", option4 = "Marcel Proust", answerNr = 3))
            questionDao.insert(Question(question = "Quelle est la capitale de l'Italie?", option1 = "Milan", option2 = "Naples", option3 = "Venise", option4 = "Rome", answerNr = 4))
            questionDao.insert(Question(question = "Quelle est la monnaie officielle de la Russie?", option1 = "Rouble", option2 = "Zloty", option3 = "Peso", option4 = "Dinar", answerNr = 1))
            questionDao.insert(Question(question = "Quel est le plus grand lac d'Amérique du Nord?", option1 = "Lac Michigan", option2 = "Lac Huron", option3 = "Lac Supérieur", option4 = "Lac Érié", answerNr = 3))
            questionDao.insert(Question(question = "Quel est le plus grand océan de la planète?", option1 = "Océan Atlantique", option2 = "Océan Indien", option3 = "Océan Arctique", option4 = "Océan Pacifique", answerNr = 4))
        }
    }
}
