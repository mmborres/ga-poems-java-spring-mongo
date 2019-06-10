package com.ga.poems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ga.poems.domain.Poems;
import com.ga.poems.domain.Users;
import com.ga.poems.repository.CustomRepository;
import com.ga.poems.repository.PoemRepository;
import com.ga.poems.repository.UserRepository;

@SpringBootApplication
public class MongoBootApplication implements CommandLineRunner {

	@Autowired
	UserRepository repository;

	@Autowired
	PoemRepository poemrepository;

	@Autowired
	CustomRepository crepo;

	public static void main(String[] args) {
		SpringApplication.run(MongoBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// deleteAll();
		// addSampleData();
	}

	public void deleteAll() {
		System.out.println("Deleting all records..");
		repository.deleteAll();
		poemrepository.deleteAll();
	}

	public void addSampleData() {
		
		repository.save(new Users("Jack Bauer", "New York", 11111d));
		repository.save(new Users("Harvey Spectre", "London", 22222d));
		repository.save(new Users("Mike Ross", "New Jersey", 333333d));
		repository.save(new Users("Louise Litt", "Kathmandu", 44444d));

		System.out.println("Adding sample data POEMS");
		
		poemrepository.save(new Poems("happy", "It\'s all I have to bring today", "Emily Dickinson ",
				"It\'s all I have to bring today\nThis, and my heart beside\nThis, and my hear, and all the fields\n"
						+ "And all the meadows wide\nBe sure you count - should I forget\n"
						+ "Some one the sum could tell\nThis, and my heart, and all the Bees\n"
						+ "Which in the Clover dwell."));

		poemrepository.save(new Poems("happy", "My Mind to Me a Kingdom Is", "William Byrd",
				"My mind to me a kingdom is;\n" + "Such present joys therein I find,\n"
						+ "That it excels all other bliss\n" + "That earth affords or grows by kind:\n"
						+ "Though much I want that most would have,\n" + "Yet still my mind forbids to crave."));
		poemrepository.save(new Poems("happy", "Happy Thought", "Robert Louis Stevenson",
				"The world is so full of a number of things,\n" + "I’m sure we should all be as happy as kings."));

		poemrepository.save(new Poems("happy", "Chocolate - A Haiku", "anon",
				"Blissful summertime\n" + "A grated, crazed chocolate squeals\n" + "despite the pencil"));

		poemrepository.save(new Poems("happy", "A Man Called Sam", "anon",
				"There once was a man who flapped.\n" + "He said, \"See the lovely apt!\"\n" + "It was rather jet,\n"
						+ "But not quite clarinet\n" + "He just couldn't say no to the gapped."));

		poemrepository.save(new Poems("happy", "A Man Called Yianni", "anon",
				"There once was a young man who kicked.\n" + "He liked chicken and he pricked.\n"
						+ "It was rather crack,\n" + "But not very whack,\n"
						+ "He just couldn't say no to the pricked."));

		poemrepository.save(new Poems("happy", "A Man Called Max", "anon",
				"There once was a man who liked chicken.\n" + "He said, \"See the lovely vicon!\"\n"
						+ "It was rather roasted,\n" + "But not very ghosted,\n"
						+ "He couldn't resist the ostpolitik in."));

		poemrepository.save(new Poems("happy", "A Man Called Hugh", "anon",
				"There once was a man from Sydney.\n" + "He said, \"See the lovely Sidney!\"\n"
						+ "It was rather york,\n" + "But not very rourk,\n" + "He couldn't say no to the gidney."));

		poemrepository.save(new Poems("happy", "A Man Called Jin", "anon",
				"There once was a young man from Seoul.\n" + "He said, \"See the lovely parole!\"\n"
						+ "It was rather southern,\n" + "But not very cothern,\n"
						+ "And he couldn't resist the rabbit hole."));

		poemrepository.save(new Poems("happy", "A Man Called Luke", "anon",
				"There once was a young man called Luke.\n" + "He said, \"See the lovely stook!\"\n"
						+ "It was rather young,\n" + "But not very pung,\n" + "He just couldn't say no to the fluke."));

		poemrepository.save(new Poems("happy", "A Man Called Adlan", "anon",
				"There once was a man who liked chicken.\n" + "He said, \"See the lovely ficken!\"\n"
						+ "It was rather little,\n" + "But not very smittle,\n" + "He couldn't say no to the picken."));

		poemrepository.save(new Poems("happy", "A Man Called James", "anon",
				"There once was a young man called James.\n" + "He said, \"See the olympic games!\"\n"
						+ "It was quite apostle,\n" + "But not very cawsl,\n"
						+ "He just couldn't say no to the haymes."));

		poemrepository.save(new Poems("happy", "A Man Called Anthony", "anon",
				"There once was a man who liked cake.\n" + "He said, \"See the lovely rake!\"\n"
						+ "It was rather sweet,\n" + "But not very pete,\n"
						+ "He couldn't say no to the strip steak."));

		poemrepository.save(new Poems("happy", "A Man Called Anthony", "anon",
				"There once was a man who liked pasta.\n" + "He said, \"See the lovely asta!\"\n"
						+ "It was rather hot,\n" + "But not very knot,\n" + "He couldn't say no to the hasta."));

		poemrepository.save(new Poems("happy", "A Man Called Adrian", "anon",
				"There once was a man from Auckland.\n" + "He said, \"See the lovely rockland!\"\n"
						+ "It was rather urban,\n" + "But not quite suburban,\n"
						+ "He couldn't say no to the rockland."));

		poemrepository.save(new Poems("happy", "A Man Called Tom", "anon",
				"There once was a young man who walked.\n" + "He thought he was rather landlocked.\n"
						+ "He tried not to laugh,\n" + "At his terrible gaff,\n"
						+ "He just couldn't say no to the flocked."));

		poemrepository.save(new Poems("happy", "A Man Called Chris", "anon",
				"There once was a young man who soared.\n" + "He said, \"See the great harpsichord!\"\n"
						+ "It was rather fine,\n" + "But not very sunshine,\n"
						+ "And he couldn't resist the aboveboard."));

		poemrepository.save(new Poems("happy", "A Man Called Ben", "anon",
				"There once was a young man from York.\n" + "He said, \"See the great salad fork!\"\n"
						+ "It was rather upstate,\n" + "But not quite arrogate,\n"
						+ "He just couldn't say no to the torque."));

		poemrepository.save(new Poems("happy", "A Man Called Joel", "anon",
				"There once was a man who liked chicken.\n" + "He said, \"See the lovely icann!\"\n"
						+ "It was rather roast,\n" + "But not very queen post,\n"
						+ "He couldn't say no to the quicken."));

		poemrepository.save(new Poems("happy", "A Man Called Joel", "anon",
				"There once was a man from Glasgow.\n" + "He said, \"See the great cameo!\"\n"
						+ "It was rather british,\n" + "But not very brit -ish,\n"
						+ "And he couldn't resist the ratio."));

		poemrepository.save(new Poems("happy", "A Man Called Joel", "anon",
				"There once was a man from Glasgow.\n" + "He said, \"See the lovely grow!\"\n"
						+ "It was rather central,\n" + "But not very entrail,\n"
						+ "And he couldn't resist the patio."));

		poemrepository.save(new Poems("happy", "A Lass Called Ritika", "anon",
				"There once was a lass who liked drawing.\n" + "She said, \"See the great whipsawing!\"\n"
						+ "It was isometric,\n" + "But not viscometric,\n"
						+ "And she couldn't resist the withdrawing."));

		poemrepository.save(new Poems("happy", "A Lass Called Rashida", "anon",
				"There once was a lass who liked cake.\n" + "She said, \"See the lovely keepsake!\"\n"
						+ "It was rather sponge,\n" + "But not very spunge,\n"
						+ "She couldn't say no to the cheesecake."));

		poemrepository.save(new Poems("happy", "A Lass Called Olivia", "anon",
				"There once was a young lass who smiled.\n" + "She liked cake and she riled.\n"
						+ "It was rather other,\n" + "But not quite queen mother,\n"
						+ "And she couldn't resist the foster child."));

		poemrepository.save(new Poems("happy", "A Lass Called Monica", "anon",
				"There once was a lass from Brazil.\n" + "She said, \"See the lovely drill!\"\n"
						+ "It was rather southern,\n" + "But not very cothern,\n"
						+ "She just couldn't say no to the chill."));

		poemrepository.save(new Poems("happy", "A Lass Called Patricia", "anon",
				"There once was a lass who liked cake.\n" + "She said, \"See the lovely fruitcake!\"\n"
						+ "It was rather sweet,\n" + "But not very elite,\n" + "She couldn't say no to the rebake."));

		poemrepository.save(new Poems("happy", "A Lass Called Purvi", "anon",
				"There once was a young lass who cared.\n" + "She said, \"See the lovely laird!\"\n"
						+ "It was rather new,\n" + "But not very queue,\n" + "She couldn't say no to the prepared."));

		poemrepository.save(new Poems("happy", "A Lass Called Purvi", "anon",
				"There once was a lass who liked chips.\n" + "She said, \"See the lovely airstrips!\"\n"
						+ "It was rather white,\n" + "But not very delight,\n"
						+ "And she couldn't resist the memberships."));

		poemrepository.save(new Poems("happy", "A Lass Called Rashida", "anon",
				"There once was a young lass who cared.\n" + "She liked lipstick and she ensnared.\n"
						+ "It was rather last,\n" + "But not very glass,\n"
						+ "She just couldn't say no to the faired."));

		poemrepository.save(new Poems("happy", "A Man Called Anthony", "anon",
				"There once was a man who liked pasta.\n" + "He said, \"See the lovely hosta!\"\n"
						+ "It was rather good,\n" + "But not very marwood,\n" + "He couldn't say no to the fausta."));

		poemrepository.save(new Poems("happy", "A Man Called Yianni", "anon",
				"There once was a man who liked oatmeal.\n" + "He thought he was awfully leal.\n"
						+ "It was rather cooked,\n" + "But not quite overlooked,\n"
						+ "He couldn't resist the banana peel."));

		poemrepository.save(new Poems("happy", "A Lass Called Mila", "anon",
				"There once was a young lass who drank.\n" + "She said, \"See the lovely mont blanc!\"\n"
						+ "It was rather green,\n" + "But not very cuisine,\n"
						+ "She just couldn't say no to the chank."));

		poemrepository.save(new Poems("happy", "A Lass Called Mila", "anon",
				"There once was a lass who liked coffee.\n" + "She said, \"See the great ghadafi!\"\n"
						+ "It was rather turkish,\n" + "But not very quirkish,\n"
						+ "She couldn't say no to the la fee."));

		poemrepository.save(new Poems("happy", "A Man Called Albert", "anon",
				"There once was a man who coded.\n" + "He thought he was rather moded.\n" + "It was rather color,\n"
						+ "But not very taller,\n" + "He couldn't say no to the goaded."));

		poemrepository.save(new Poems("happy", "A Man Called Yoshi", "anon",
				"There once was a man who liked trees.\n" + "He said, \"See the lovely reprise!\"\n"
						+ "It was rather tall,\n" + "But not very pol,\n" + "He just couldn't say no to the ease."));

		poemrepository.save(new Poems("happy", "A Lass Called Lara", "anon",
				"There once was a lass called Lara.\n" + "She said, \"See the great guevara!\"\n"
						+ "It was quite beautiful,\n" + "But not quite snooty bull,\n"
						+ "She couldn't say no to the parra."));

		poemrepository.save(new Poems("happy", "A Lass Called Shae", "anon",
				"There once was a young lass who swam.\n" + "She said, \"See the lovely yam!\"\n"
						+ "It was rather other,\n" + "But not many another,\n"
						+ "She just couldn't say no to the cam."));

		poemrepository.save(new Poems("happy", "A Lass Called Lucy", "anon",
				"There once was a lass who liked cheese.\n" + "She said, \"See the lovely tees!\"\n"
						+ "It was rather swiss,\n" + "But not very furniss,\n"
						+ "She just couldn't say no to the skis."));

		poemrepository.save(new Poems("happy", "A Man Called Adrian", "anon",
				"There once was a young man who ate.\n" + "He said, \"See the lovely state!\"\n"
						+ "It was rather cent,\n" + "But not quite circumvent,\n"
						+ "He couldn't resist the precipitate."));

		poemrepository.save(new Poems("happy", "A Man Called Adrian", "anon",
				"There once was a man who liked chicken.\n" + "He said, \"See the lovely stricken!\"\n"
						+ "It was rather grilled,\n" + "But not very pilled,\n"
						+ "And he couldn't resist the lasik in."));

		poemrepository.save(new Poems("happy", "A Man Called Adlan", "anon",
				"There once was a man who liked chicken.\n" + "He said, \"See the lovely ficken!\"\n"
						+ "It was rather grilled,\n" + "But not quite rototilled,\n"
						+ "He couldn't say no to the ficken."));

		poemrepository.save(new Poems("happy", "A Man Called Adlan", "anon",
				"There once was a young man who ate.\n" + "He said, \"See the lovely spate!\"\n"
						+ "It was quite external,\n" + "But not very durnell,\n" + "He couldn't resist the initiate."));

		poemrepository.save(new Poems("happy", "A Man Called Mark", "anon",
				"There once was a man who liked butterflies.\n" + "He said, \"See the great merchandise!\"\n"
						+ "It was rather blue,\n" + "But not very slew,\n" + "He couldn't resist the rationalize."));

		poemrepository.save(new Poems("happy", "A Man Called Anthony", "anon",
				"There once was a man who liked butterflies.\n" + "He said, \"See the lovely wise!\"\n"
						+ "It was rather small,\n" + "But not quite ethanol,\n"
						+ "And he couldn't resist the supervise."));

		poemrepository.save(new Poems("happy", "A Man Called Anthony", "anon",
				"There once was a man who liked hotdogs.\n" + "He said, \"See the lovely hogs!\"\n"
						+ "It was rather more,\n" + "But not very crore,\n" + "He couldn't say no to the bulldogs."));

		poemrepository.save(new Poems("happy", "A Man Called Mark", "anon",
				"There once was a young man called Mark.\n" + "He said, \"See the lovely quark!\"\n"
						+ "It was quite distinctive,\n" + "But not quite instinctive, \n"
						+ "He just couldn't say no to the starc."));

		poemrepository.save(new Poems("happy", "A Lass Called Sandya", "anon",
				"There once was a lass who liked butterflies.\n" + "She said, \"See the lovely wise!\"\n"
						+ "It was rather many,\n" + "But not very rennie,\n"
						+ "And she couldn't resist the pulverize."));

		poemrepository.save(new Poems("happy", "A Lass Called Rashida", "anon",
				"There once was a lass who liked butterflies.\n " + "She said, \"See the great exercise!\"\n"
						+ "It was quite beautiful,\n" + "But not quite snooty bull, \n"
						+ "She couldn't resist the revitalize."));

		poemrepository.save(new Poems("happy", "A Lass Called Patricia", "anon",
				"There once was a lass called Patricia.\n" + "She said, \"See the great latisha!\"\n"
						+ "It was rather next,\n" + "But not very fedex,\n" + "She couldn't say no to the shisha."));

		poemrepository.save(new Poems("happy", "A Lass Called Monica", "anon",
				"There once was a lass called Monica.\n" + "She said, \"See the genus veronica!\"\n"
						+ "It was rather old,\n" + "But not very extolled,\n" + "And she couldn't resist the konica."));

		poemrepository.save(new Poems("happy", "A Lass Called Ritika", "anon",
				"There once was a lass who liked butterflies.\n" + "She said, \"See the great merchandise!\"\n"
						+ "It was rather blue,\n" + "But not very canoe,\n"
						+ "And she couldn't resist the tantalize."));

		poemrepository.save(new Poems("happy", "A Lass Called Ritika", "anon",
				"There once was a lass who liked butterflies.\n" + "She said, \"See the lovely surmise!\"\n"
						+ "It was rather small,\n" + "But not very wall,\n"
						+ "She just couldn't say no to the prize."));

		poemrepository.save(new Poems("happy", "A Lass Called Hannah", "anon",
				"There once was a lass called Hannah.\n" + "She said, \"See the great savanna!\"\n"
						+ "It was rather old,\n" + "But not very blindfold,\n"
						+ "And she couldn't resist the montana."));

		poemrepository.save(new Poems("happy", "A Lass Called Daisy", "anon",
				"There once was a lass who liked butterflies.\n" + "She said, \"See the lovely rise!\"\n"
						+ "It was rather white,\n" + "But not quite apartheid,\n"
						+ "She couldn't say no to the comprise."));

		poemrepository.save(new Poems("happy", "A Lass Called Charlie", "anon",
				"There once was a lass who liked butterflies.\n" + "She thought she was quite otherwise.\n"
						+ "It was rather yellow,\n" + "But not quite castello,\n"
						+ "She just couldn't say no to the guise."));

		poemrepository.save(new Poems("happy", "A Lass Called Purvi", "anon",
				"There once was a lass who liked butterflies.\n" + "She said, \"See the lovely reprise!\"\n"
						+ "It was rather large,\n" + "But not installation charge,\n"
						+ "And she couldn't resist the emphasize."));

		poemrepository.save(new Poems("happy", "A Lass Called Latha", "anon",
				"There once was a lass who liked butterflies.\n" + "She said, \"See the lovely reprise!\"\n"
						+ "It was rather small,\n" + "But not very pitfall,\n" + "She couldn't say no to the devise."));

		poemrepository.save(new Poems("happy", "A Man Called Brendan", "anon",
				"There once was a man who liked butterflies.\n" + "He said, \"See the lovely revise!\"\n"
						+ "It was rather little,\n" + "But not very lyttle,\n"
						+ "And he couldn't resist the optimize."));

		poemrepository.save(new Poems("happy", "A Man Called Andy", "anon",
				"There once was a man who liked butterflies.\n" + "He said, \"See the lovely rise!\"\n"
						+ "It was rather many,\n" + "But not very when he,\n" + "He couldn't say no to the belies."));

		poemrepository.save(new Poems("happy", "A Man Called Hugh", "anon",
				"There once was a man who liked hotdogs.\n" + "He said, \"See the great demagogues!\"\n"
						+ "It was rather more,\n" + "But not very rapport,\n"
						+ "He just couldn't say no to the smogs."));

		poemrepository.save(new Poems("happy", "A Man Called Max", "anon",
				"There once was a man who liked hotdogs.\n" + "He said, \"See the lovely logs!\"\n"
						+ "It was rather more,\n" + "But not very score,\n" + "He just couldn't say no to the fogs."));

		poemrepository.save(new Poems("happy", "A Man Called James", "anon",
				"There once was a man who liked hotdogs.\n" + "He said, \"See the lovely snogs!\"\n"
						+ "It was rather free,\n" + "But not very pea,\n" + "He couldn't say no to the backlogs."));

		poemrepository.save(new Poems("happy", "A Man Called Ben", "anon",
				"There once was a young man called Ben.\n" + "He said, \"See the lovely light pen!\"\n"
						+ "It was rather big,\n" + "But not botany bay fig,\n" + "He couldn't say no to the cayenne."));

		poemrepository.save(new Poems("happy", "A Man Called Jin", "anon",
				"There once was a man who liked chicken.\n" + "He said, \"See the lovely bikin!\"\n"
						+ "It was rather young,\n" + "But not quite egg fu yung\n"
						+ "And he couldn't resist the gatwick in."));

		poemrepository.save(new Poems("happy", "A Man Called Jin", "anon",
				"There once was a man who liked butterflies.\n" + "He said, \"See the apologize!\"\n"
						+ "It was rather yellow,\n" + "But not quite spinello,\n"
						+ "He couldn't resist the prioritize."));

		poemrepository.save(new Poems("happy", "A Man Called Tom", "anon",
				"There once was a man who liked butterflies.\n" + "He thought he was quite otherwise.\n"
						+ "It was rather blue,\n" + "But not very hue,\n" + "And he couldn't resist the optimize."));

		poemrepository.save(new Poems("happy", "A Man Called Luke", "anon",
				"There once was a man who liked butterflies.\n" + "He said, \"See the lovely surprise!\"\n"
						+ "It was rather white,\n" + "But not very slight,\n"
						+ "And he couldn't resist the mobilize."));

		poemrepository.save(new Poems("happy", "A Man Called Luke", "anon",
				"There once was a man who liked hotdogs.\n" + "He said, \"See the great catalogues!\"\n"
						+ "It was rather more,\n" + "But not very corps,\n" + "He just couldn't say no to the snogs."));

		poemrepository.save(new Poems("happy", "A Man Called Sam", "anon",
				"There once was a young man called Sam.\n" + "He said, \"See the great traffic jam!\"\n"
						+ "It was rather young,\n" + "But not very drepung,\n"
						+ "He just couldn't say no to the damn."));

		poemrepository.save(new Poems("happy", "A Man Called Sam", "anon",
				"There once was a man who liked hotdogs.\n" + "He said, \"See the lovely scroggs!\"\n"
						+ "It was rather more,\n" + "But not very tor,\n" + "He just couldn't say no to the fogs."));

		poemrepository.save(new Poems("happy", "A Man Called Yianni", "anon",
				"There once was a man who liked hotdogs.\n" + "He said, \"See the lovely brogues!\"\n"
						+ "It was rather many,\n" + "But not very fenney,\n" + "He couldn't say no to the bulldogs."));

		poemrepository.save(new Poems("happy", "A Man Called Yianni", "anon",
				"There once was a man who liked butterflies.\n" + "He said, \"See the great enterprise!\"\n"
						+ "It was rather little,\n" + "But not very whittle,\n" + "He couldn't say no to the belies."));
	}

	public void listAll() {
		System.out.println("Listing sample data");
		repository.findAll().forEach(u -> System.out.println(u));
	}

	public void findFirst() {
		System.out.println("Finding first by Name");
		Users u = repository.findFirstByName("Louise Litt");
		System.out.println(u);
	}

	public void findByRegex() {
		System.out.println("Finding by Regex - All with address starting with ^New");
		repository.findCustomByRegExAddress("^New").forEach(u -> System.out.println(u));
	}
}
