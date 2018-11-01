package hiphopdb.database;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DataSource {
	private ArrayList<Album> albums;
	private ArrayList<Artist> artists;
	private ArrayList<Playlist> playlists;

	public DataSource() {
		try {
			albums = new ArrayList<Album>();
			artists = new ArrayList<Artist>();
			playlists = new ArrayList<Playlist>();

			// Artists
			Artist a1 = new Artist(1, "Travis Scott", "Jacques Berman Webster II",
					new SimpleDateFormat("dd/MM/yyyy").parse("30/04/1992"), 2008,
					"Jacques Webster (born April 30, 1992), better known by his stage name Travis Scott (formerly stylized as Travi$ Scott), is an American rapper, singer, songwriter, and record producer.\r\n"
							+ "\r\n"
							+ "In 2012, Scott signed his first major-label deal with Epic Records. In November of the same year, Scott signed a deal with Kanye West's GOOD Music, to be a part of its production wing Very GOOD Beats, after appearing on the label's 2012 compilation album Cruel Summer. In April 2013, it was announced Scott signed a record deal with T.I.'s Grand Hustle imprint.\r\n"
							+ "\r\n"
							+ "Scott's first full-length project, a mixtape titled Owl Pharaoh, was self-released in May 2013. This was followed with a second mixtape, titled Days Before Rodeo, in August 2014. Scott's debut studio album Rodeo, was released in September 2015 and was led by the hit single \"Antidote\", which reached the top 20 of the US Billboard Hot 100 chart. His second album, Birds in the Trap Sing McKnight, was released in September 2016, to generally positive reviews.\r\n"
							+ "\r\n"
							+ "Outside of his solo career, Scott is also a member of the supergroup, Huncho Jack with Quavo. The pair released their first collaborative album on December 21, 2017 titled Huncho Jack, Jack Huncho.");
			Artist a2 = new Artist(2, "Quavo", "Quavoious Keyate Marshall",
					new SimpleDateFormat("dd/MM/yyyy").parse("02/04/1991"), 2009,
					"Quavious Keyate Marshall (born April 2, 1991), known professionally as Quavo, is an American rapper, singer, songwriter and record producer. He is best known as a member of the rap trio Migos. Quavo is directly related to his fellow Migos members, being Takeoff’s uncle and Offset's cousin.[2]\r\n"
							+ "\r\n"
							+ "Outside of Migos, Quavo has been featured on four singles which have peaked within the top 10 of the Billboard Hot 100, including DJ Khaled's \"I'm the One\".");
			Artist a3 = new Artist(3, "Offset", "Kiari Kendrell Cephus",
					new SimpleDateFormat("dd/MM/yyyy").parse("14/12/1991"), 2009,
					"Kiari Kendrell Cephus (born December 14, 1991), better known by his stage name Offset, is an American hip hop recording artist from Lawrenceville, Georgia. He is best known as a member of the hip hop and trap music trio Migos, alongside Takeoff and Quavo.");
			Artist a4 = new Artist(4, "Lil Uzi Vert", "Symere Woods",
					new SimpleDateFormat("dd/MM/yyyy").parse("31/07/1994"), 2013,
					"Symere Woods (born July 31, 1994), known professionally as Lil Uzi Vert, is an American hip hop recording artist, singer, songwriter and musician. Based in Philadelphia, he gained recognition after releasing his debut single, \"Money Longer\", and several mixtapes, including Luv Is Rage, Lil Uzi Vert vs. the World, and The Perfect Luv Tape. Lil Uzi Vert has also collaborated with Migos on \"Bad and Boujee\", which became Lil Uzi Vert's first US Billboard Hot 100 number-one single. In August 2017, Lil Uzi Vert released his debut studio album Luv Is Rage 2, which reached number one on the Billboard 200 Albums Chart.");
			Artist a5 = new Artist(5, "Future", "Nayvadius DeMun Wilburn",
					new SimpleDateFormat("dd/MM/yyyy").parse("20/11/1983"), 2009,
					"Nayvadius DeMun Wilburn (born November 20, 1983), known professionally as Future, is an American rapper, singer, songwriter, and record producer. Born and raised in Atlanta, Georgia, Wilburn first became involved in music as part of the Dungeon Family collective, where he was nicknamed \"the Future\". After amassing a series of mixtapes between 2010 and 2011, Future signed a major record label deal with Epic Records and A1 Recordings, which helped launch Future's own label imprint, Freebandz. He subsequently released his debut album, Pluto, in April 2012 to positive reviews. Future's second album, Honest, was released in April 2014, surpassing his debut on the album charts.\r\n"
							+ "\r\n"
							+ "Between late 2014 and early 2015, he released a trio of mixtapes to critical praise: Monster (2014), Beast Mode (2015), and 56 Nights (2015). His next releases, DS2 (2015), What a Time to Be Alive (2015, in collaboration with Drake), Evol (2016), Future (2017) and Hndrxx (2017) all debuted at number one on the U.S. Billboard 200. The latter two made him the first artist since 1968 to debut two albums in consecutive weeks atop of that chart. Future has also released several singles certified gold or higher by the RIAA, including \"Turn On the Lights\", \"Move That Dope\", \"Fuck Up Some Commas\", \"Where Ya At\", \"Jumpman\", \"Low Life\" and \"Mask Off\".");
			Artist a6 = new Artist(6, "Drake", "Aubrey Drake Graham",
					new SimpleDateFormat("dd/MM/yyyy").parse("24/10/1986"), 2001,
					"Aubrey Drake Graham (born October 24, 1986) is a Canadian rapper, singer, songwriter, record producer, actor, and entrepreneur. Drake initially gained recognition as an actor on the teen drama television series Degrassi: The Next Generation in the early 2000s.\r\n"
							+ "\r\n"
							+ "Intent on pursuing a career as a rapper, he departed the series in 2007 following the release of his debut mixtape, Room for Improvement. He released two further independent projects, Comeback Season and So Far Gone, before signing to Lil Wayne's Young Money Entertainment in June 2009.\r\n"
							+ "\r\n"
							+ "Drake released his debut studio album Thank Me Later in 2010, which debuted at number one on the US Billboard 200 and was soon certified platinum by the RIAA. His next two releases, 2011's Take Care and 2013's Nothing Was the Same, were critically and commercially successful; the former earned him his first Grammy Award for Best Rap Album. In 2015, he released two mixtapes—the trap-influenced If You're Reading This It's Too Late and a collaboration with Future titled What a Time to Be Alive—both of which earned platinum certification in the U.S.\r\n"
							+ "\r\n"
							+ "His fourth album, Views (2016), broke several chart records. The dancehall-influenced album sat atop the Billboard 200 for 13 nonconsecutive weeks, becoming the first album by a male solo artist to do so in over 10 years. The album's second single, \"One Dance\", topped the charts in several countries, including the US, the UK, and Canada, where it became his first number-one single as a lead artist. That year, Drake lead both the Billboard Hot 100 and the Billboard 200 charts simultaneously for eight weeks. Views achieved quadruple platinum status in the US, and earned over 1 million album-equivalent units in the first week of its release. Its lead single \"Hotline Bling\" received Grammy Awards for Best Rap/Sung Performance and Best Rap Song. In 2017, he released the mixtape More Life. Described by Drake as a \"playlist\", it became his seventh consecutive number one on the Billboard 200, and set multiple streaming records.[18] A year later, he released the double album Scorpion, which also broke several streaming records.");
			Artist a7 = new Artist(7, "Juicy J", "Jordan Michael Houston",
					new SimpleDateFormat("dd/MM/yyyy").parse("05/04/1975"), 1991,
					"Jordan Michael Houston (born April 5, 1975), known professionally as Juicy J, is an American rapper, songwriter and record producer from Memphis, Tennessee. He is a founding member of the Southern hip hop group Three 6 Mafia, established in 1991. In 2002, he released his solo debut album Chronicles of the Juice Man, in between Three 6 Mafia projects. In 2011, Juicy J announced that he was a part-owner and A&R rep for Wiz Khalifa's Taylor Gang Records, and the following year, he signed a solo deal with Columbia Records and Dr. Luke's Kemosabe Records. Juicy J released Stay Trippy, his third studio album under the aforementioned labels on August 27, 2013. He is the younger brother of frequent collaborator and fellow rapper Project Pat.");
			Artist a8 = new Artist(8, "Swae Lee", "Khalif Brown",
					new SimpleDateFormat("dd/MM/yyyy").parse("07/06/1995"), 2009,
					"Khalif Malik Ibin Shaman Brown, better known by his stage name Swae Lee, is an American rapper, singer, and songwriter. He is one half of the hip hop duo Rae Sremmurd with his brother Slim Jxmmi.\r\n"
							+ "\r\n"
							+ "In 2017, the single \"Unforgettable\" by French Montana featuring Swae Lee, reached the top 3 on the U.S. Billboard Hot 100.");
			Artist a9 = new Artist(9, "Slim Jxmmi", "Aaquil Brown",
					new SimpleDateFormat("dd/MM/yyyy").parse("29/12/1993"), 2009,
					"Aaquil Brown, better known by his stage name Slim Jxmmi, is an American rapper, singer, and songwriter. He is one half of the hip hop duo Rae Sremmurd with his brother Swae Lee.");
			Artist a10 = new Artist(10, "Lil Pump", "Gazzy Garcia",
					new SimpleDateFormat("dd/MM/yyyy").parse("17/08/2000"), 2016,
					"Gazzy Garcia (born August 17, 2000), known professionally as Lil Pump, is an American rapper and songwriter. He is best known for his song \"Gucci Gang\" which peaked at number three on the U.S. Billboard Hot 100, and other songs such as \"D Rose\" and \"Boss\". The song \"Gucci Gang\" has been certified platinum. He released his debut studio album, Lil Pump, on October 6, 2017. He has subsequently released songs including \"iShyne\", \"Designer\", and \"Esskeetit.\" Along with French Montana and Diplo, he recorded \"Welcome to the Party\", which debuted on Deadpool 2's soundtrack. Charlie Sheen starred in the video of Pump's next single release, \"Drug Addicts\".");
			Artist a11 = new Artist(11, "Smokepurpp", "Omar Pineiro",
					new SimpleDateFormat("dd/MM/yyyy").parse("15/05/1997"), 2013,
					"Omar Pineiro (born May 15, 1997), known professionally as Smokepurpp, is an American rapper from Miami, Florida. Pineiro released his first music video \"It’s Nothin\" with Lil Ominous on September 23, 2014. Pineiro initially found success on the audio distribution platform SoundCloud in 2016 after his song \"Ski Mask\" and \"Audi\" went viral. Originally a producer, Pineiro is one of the most known figures of the \"SoundCloud rap\" movement due to his influence on artists such as Lil Pump who have since entered the mainstream music market.\r\n"
							+ "\r\n"
							+ "Pineiro released his debut commercial mixtape Deadstar on September 28, 2017, and the mixtape peaked at number 42 on the Billboard 200 albums chart.");
			Artist a12 = new Artist(12, "21 Savage", "Shayaa Bin Abraham-Joseph",
					new SimpleDateFormat("dd/MM/yyyy").parse("22/10/1992"), 2014,
					"Shayaa Bin Abraham-Joseph (born October 22, 1992), better known by his stage name 21 Savage, is an American rapper.\r\n"
							+ "\r\n"
							+ "Born in Roseau, Dominica, Abraham-Joseph grew up around criminality and eventually dropped out of school to become a full time drug dealer. He began rapping in 2013 after the death of a friend and quickly caught attention in the Atlanta underground for the 2015 mixtape The Slaughter Tape before getting nationwide attention after the Metro Boomin produced Savage Mode and his collaboration with Drake, \"Sneakin'\" was released.\r\n"
							+ "\r\n"
							+ "Abraham-Joseph released his debut studio album, Issa Album, in 2017 which debuted at number two on the Billboard 200 and gave Abraham-Joseph his first top twenty song, \"Bank Account.\" He achieved his first number one single at the end of 2017 with his feature on Post Malone's \"Rockstar.\"");
			Artist a13 = new Artist(13, "Cardi B", "Belcalis Marlenis Almanzar",
					new SimpleDateFormat("dd/MM/yyyy").parse("11/10/1992"), 2015,
					"Belcalis Marlenis Almanzar (born October 11, 1992) known professionally as Cardi B, is an American rapper. Born and raised in The Bronx, New York City, she first attracted attention for discussing her career as a stripper on social media; coupled with her \"no filter attitude\", she became an Internet celebrity through Instagram. From 2015 to 2017, she appeared as a regular cast member on the VH1 reality television series Love & Hip Hop: New York, and released two mixtapes.\r\n"
							+ "\r\n"
							+ "Since signing with Atlantic Records in 2017, she has earned two number-one singles on the US Billboard Hot 100 with \"Bodak Yellow\" and \"I Like It\". The former made her the second-ever female rapper to top the chart with a solo output, following Lauryn Hill in 1998; the latter made her the first female rapper to attain multiple number-one songs on the chart. Her debut studio album Invasion of Privacy (2018), on which both songs were included, reached number one on the Billboard 200. Time named the rapper one of the 100 most influential people in the world on their annual list in 2018.");
			Artist a14 = new Artist(14, "Gucci Mane", "Radric Delantic Davis",
					new SimpleDateFormat("dd/MM/yyyy").parse("12/02/1980"), 2001,
					"Radric Delantic Davis (born February 12, 1980), known professionally as Gucci Mane, is an American rapper. Since releasing his debut album Trap House in 2005, Gucci has gone on to release 12 studio albums and over 70 mixtapes. In 2007, Gucci Mane founded his own label, 1017 Records. He helped to pioneer the hip hop subgenre trap music, alongside fellow Atlanta-based rappers T.I. and Young Jeezy.\r\n"
							+ "\r\n"
							+ "In 2005, Gucci Mane debuted with Trap House, followed by his second and third albums, Hard to Kill and Trap-A-Thon in 2006. His fourth album, Back to the Trap House was released in 2007. In 2009, Gucci Mane released his sixth studio album, The State vs. Radric Davis, going on to become his first gold certified album. Following time spent in prison between 2014 and 2016, he re-emerged with several new retail projects, including Everybody Looking (2016), which was released to critical praise.\r\n"
							+ "\r\n"
							+ "Gucci Mane has released over 90 body of works and has worked with artists such as Drake, Lil Wayne, Chris Brown, Selena Gomez, Mariah Carey and Marilyn Manson. His 2016 collaboration with Rae Sremmurd, titled \"Black Beatles\", provided Gucci Mane with his first number-one single on the US Billboard Hot 100 chart. El Gato: The Human Glacier is his latest album.");
			Artist a15 = new Artist(15, "Young Thug", "Jeffrey Williams",
					new SimpleDateFormat("dd/MM/yyyy").parse("16/08/1991"), 2011,
					"Jeffery Lamar Williams, known professionally as Young Thug, is an American rapper, singer, songwriter, and record producer. Known for his eccentric vocal style and fashion, he first received attention for his collaborations with rappers Rich Homie Quan, Birdman, Cash Out, Shawty Lo and Gucci Mane. Young Thug initially released a series of independent mixtapes beginning in 2011 with I Came from Nothing. In early 2013, he signed with Gucci Mane's 1017 Records, and later that year he released his label debut mixtape 1017 Thug to critical praise.\r\n"
							+ "\r\n"
							+ "Young Thug received mainstream recognition in 2014 with the singles \"Stoner\" and \"Danny Glover\" in addition to appearances on several singles, including T.I.'s \"About the Money\" and Rich Gang's \"Lifestyle.\" That year, he also signed to Lyor Cohen's 300 Entertainment and collaborated on the mixtape Rich Gang: Tha Tour Pt. 1. In 2015, he released a number of mixtapes, including Barter 6 and two installments of his Slime Season series. These were followed in 2016 by the commercial mixtapes I'm Up, Slime Season 3, and Jeffery. In 2017, he released the commercial mixtape Beautiful Thugger Girls.");
			Artist a16 = new Artist(16, "The Weeknd", "Abel Tesfaye",
					new SimpleDateFormat("dd/MM/yyyy").parse("16/02/1990"), 2010,
					"Abel Makkonen Tesfaye (born 16 February 1990), known by his stage name The Weeknd, is a Canadian singer, songwriter, and record producer.[2]\r\n"
							+ "\r\n"
							+ "Tesfaye anonymously uploaded several songs to YouTube under the name \"The Weeknd\" in 2010 and released the critically acclaimed mixtapes House of Balloons, Thursday, and Echoes of Silence in 2011. The mixtapes were later remastered and rereleased on the compilation album Trilogy (2012), after he signed with Republic Records and created his own record label XO.[citation needed]\r\n"
							+ "\r\n"
							+ "Tesfaye has had three number-one releases (Beauty Behind the Madness in 2015, Starboy in 2016, and My Dear Melancholy in 2018) and another top-two release (Kiss Land in 2013) on the US Billboard 200. He has earned eight top-ten entries on the Billboard Hot 100: \"Love Me Harder\" with Ariana Grande; \"Earned It\"; \"I Feel It Coming\"; \"Pray for Me\" with Kendrick Lamar; \"Call Out My Name\"; and the number one singles \"The Hills\", \"Can't Feel My Face\", and \"Starboy\". In 2015, Tesfaye became the first artist to simultaneously hold the top three positions on the Billboard Hot R&B Songs chart with \"Can't Feel My Face\", \"Earned It\", and \"The Hills\". Tesfaye has won three Grammy Awards and nine Juno Awards.");
			Artist a17 = new Artist(17, "6ix9ine", "Daniel Hernandez",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/05/1996"), 2017,
					"Daniel Hernandez (born May 8, 1996), known professionally as 6ix9ine (pronounced \"six nine\") or Tekashi 6ix9ine, is an American rapper. He is known for his unconventional appearance, controversial behavior and brute-force screaming technique in his songs.\r\n"
							+ "\r\n"
							+ "Hernandez rose to fame in late 2017 with the release of his debut single \"Gummo\". The song peaked at number 12 on the US Billboard Hot 100 and was certified platinum by the RIAA. In early 2018, Hernandez released his debut mixtape, Day69, which debuted at number four on the Billboard 200 album chart. He earned his first top-ten entry on the Hot 100 with \"Fefe\", featuring Nicki Minaj and Murda Beatz, which peaked at number three.");

			// Add artists to list
			artists.add(a1);
			artists.add(a2);
			artists.add(a3);
			artists.add(a4);
			artists.add(a5);
			artists.add(a6);
			artists.add(a7);
			artists.add(a8);
			artists.add(a9);
			artists.add(a10);
			artists.add(a11);
			artists.add(a12);
			artists.add(a13);
			artists.add(a14);
			artists.add(a15);
			artists.add(a16);
			artists.add(a17);

			// Tracks
			// Harvard Dropout
			Track t1 = new Track(1, "Drug Addicts", 5098456, 176, "tracks/1.mp3");
			t1.addArtist(a10);
			Track t2 = new Track(2, "iShyne", 3857623, 153, "tracks/2.mp3");
			t2.addArtist(a10);
			Track t3 = new Track(3, "ESKETIT", 9674623, 182, "tracks/3.mp3");
			t3.addArtist(a10);
			Track t4 = new Track(4, "Welcome to the Party", 4122345, 269, "tracks/4.mp3");
			t4.addArtist(a10);
			Track t5 = new Track(5, "Multi Millionaire", 41345345, 151, "tracks/5.mp3");
			t5.addArtist(a10);
			t5.addArtist(a4);

			// Astroworld
			Track t6 = new Track(6, "Sicko Mode", 12645734, 314, "tracks/6.mp3");
			t6.addArtist(a1);
			t6.addArtist(a6);
			Track t7 = new Track(7, "Can't Say", 8146853, 199, "tracks/7.mp3");
			t7.addArtist(a1);
			Track t8 = new Track(8, "Houstonfornication", 8121636, 218, "tracks/8.mp3");
			t8.addArtist(a1);
			Track t9 = new Track(9, "Wake Up", 10857124, 233, "tracks/9.mp3");
			t9.addArtist(a1);
			t9.addArtist(a16);
			Track t10 = new Track(10, "Stargazing", 8167586, 271, "tracks/10.mp3");
			t10.addArtist(a1);

			// Culture
			Track t11 = new Track(11, "Slippery", 20551863, 304, "tracks/11.mp3");
			t11.addArtist(a2);
			t11.addArtist(a3);
			t11.addArtist(a14);
			Track t12 = new Track(12, "Bad and Boujee", 143502864, 334, "tracks/12.mp3");
			t12.addArtist(a2);
			t12.addArtist(a3);
			t12.addArtist(a4);
			Track t13 = new Track(13, "T-Shirt", 19746582, 245, "tracks/13.mp3");
			t13.addArtist(a2);
			t13.addArtist(a3);
			Track t14 = new Track(14, "Kelly Price", 9184762, 365, "tracks/14.mp3");
			t14.addArtist(a2);
			t14.addArtist(a3);
			t14.addArtist(a1);
			Track t15 = new Track(15, "All Ass", 8153674, 294, "tracks/15.mp3");
			t15.addArtist(a2);
			t15.addArtist(a3);

			// Lil Pump
			Track t16 = new Track(16, "Boss", 32658234, 106, "tracks/16.mp3");
			t16.addArtist(a10);
			Track t17 = new Track(17, "Gucci Gang", 412658234, 124, "tracks/17.mp3");
			t17.addArtist(a10);
			Track t18 = new Track(18, "At the Door", 22658234, 123, "tracks/18.mp3");
			t18.addArtist(a10);
			Track t19 = new Track(19, "Molly", 52658234, 123, "tracks/19.mp3");
			t19.addArtist(a10);
			Track t20 = new Track(20, "Youngest Flexer", 72658234, 199, "tracks/20.mp3");
			t20.addArtist(a10);
			t20.addArtist(a14);

			// Invasion of Privacy
			Track t21 = new Track(21, "Bartier Cardi", 92658234, 224, "tracks/21.mp3");
			t21.addArtist(a13);
			t21.addArtist(a12);
			Track t22 = new Track(22, "I Do ft. SZA", 412658234, 200, "tracks/22.mp3");
			t22.addArtist(a13);
			Track t23 = new Track(23, "Money Bag", 42658234, 229, "tracks/23.mp3");
			t23.addArtist(a13);
			Track t24 = new Track(24, "Ring ft. Kehlani", 92658234, 177, "tracks/24.mp3");
			t24.addArtist(a13);
			Track t25 = new Track(25, "Bodak Yellow", 322658234, 222, "tracks/25.mp3");
			t25.addArtist(a13);
			
			//Luv is Rage 2
			Track t26 = new Track(26, "Unfazed", 92658234, 190, "tracks/26.mp3");
			t26.addArtist(a4);
			t26.addArtist(a16);
			Track t27 = new Track(27, "Dark Queen", 812658234, 173, "tracks/27.mp3");
			t27.addArtist(a4);
			Track t28 = new Track(28, "Pretty Mami", 42658234, 244, "tracks/28.mp3");
			t28.addArtist(a4);
			Track t29 = new Track(29, "The Way Life Goes", 92658234, 221, "tracks/29.mp3");
			t29.addArtist(a4);
			Track t30 = new Track(30, "XO Tour Llif3", 322658234, 180, "tracks/30.mp3");
			t30.addArtist(a4);

			//Birds in the Trap Sing McKnight
			Track t31 = new Track(31, "Outside", 52658234, 176, "tracks/31.mp3");
			t31.addArtist(a1);
			t31.addArtist(a12);
			Track t32 = new Track(32, "Beibs in the Trap ft. Nav", 812658234, 213, "tracks/32.mp3");
			t32.addArtist(a1);
			Track t33 = new Track(33, "Guidance", 42658234, 207, "tracks/33.mp3");
			t33.addArtist(a1);
			Track t34 = new Track(34, "Way Back ft. Kid Cudi", 92658234, 272, "tracks/34.mp3");
			t34.addArtist(a1);
			Track t35 = new Track(35, "Goosebumps ft. Kendrick Lamar", 322658234, 243, "tracks/35.mp3");
			t35.addArtist(a1);
			
			// Albums
			Album al1 = new Album(1, "Harvard Dropout", "HipHop/Rap",
					new SimpleDateFormat("dd/MM/yyyy").parse("05/07/2018"));
			Album al2 = new Album(2, "ASTROWORLD", "HipHop/Rap",
					new SimpleDateFormat("dd/MM/yyyy").parse("03/08/2018"));
			// Album al3=new Album(3,"SR3MM","HipHop/Rap",new
			// SimpleDateFormat("dd/MM/yyyy").parse("04/05/2018"));
			Album al3 = new Album(3, "Culture", "HipHop/Rap", new SimpleDateFormat("dd/MM/yyyy").parse("27/01/2017"));
			Album al4 = new Album(4, "Birds in the Trap Sing McKnight", "HipHop/Rap",
					new SimpleDateFormat("dd/MM/yyyy").parse("03/08/2018"));
			Album al5 = new Album(5, "Lil Pump", "HipHop/Rap", new SimpleDateFormat("dd/MM/yyyy").parse("06/10/2017"));
			// Album al7=new Album(7,"Deadstar","HipHop/Rap",new
			// SimpleDateFormat("dd/MM/yyyy").parse("29/09/2017"));
			// Album al8=new Album(8,"Starboy","HipHop/R&B",new
			// SimpleDateFormat("dd/MM/yyyy").parse("25/11/2016"));
			Album al6 = new Album(6, "Invasion of Privacy", "HipHop/Rap",
					new SimpleDateFormat("dd/MM/yyyy").parse("05/04/2018"));
			// Album al10=new Album(10,"Stay Trippy","HipHop/Rap",new
			// SimpleDateFormat("dd/MM/yyyy").parse("23/08/2013"));
			// Album al11=new Album(11,"Blue Dream & Lean","HipHop/Rap",new
			// SimpleDateFormat("dd/MM/yyyy").parse("29/11/2011"));
			// Album al12=new Album(12,"Sremmlife","HipHop/Rap",new
			// SimpleDateFormat("dd/MM/yyyy").parse("06/01/2015"));
			// Album al13=new Album(13,"Sremmlife 2","HipHop/Rap",new
			// SimpleDateFormat("dd/MM/yyyy").parse("12/08/2016"));
			Album al7 = new Album(7, "Luv is Rage 2", "HipHop/Rap",
					new SimpleDateFormat("dd/MM/yyyy").parse("25/09/2017"));

			// Fill Albums
			// Harvard Dropout
			al1.addArtist(a10);
			al1.addTrack(t1);
			al1.addTrack(t2);
			al1.addTrack(t3);
			al1.addTrack(t4);
			al1.addTrack(t5);

			// Astroworld
			al2.addArtist(a1);
			al2.addTrack(t6);
			al2.addTrack(t7);
			al2.addTrack(t8);
			al2.addTrack(t9);
			al2.addTrack(t10);

			// Culture
			al3.addArtist(a2);
			al3.addArtist(a3);
			al3.addTrack(t11);
			al3.addTrack(t12);
			al3.addTrack(t13);
			al3.addTrack(t14);
			al3.addTrack(t15);
			
			//Birds in the Trap Sing McKnight
			al4.addArtist(a1);
			al4.addTrack(t31);
			al4.addTrack(t32);
			al4.addTrack(t33);
			al4.addTrack(t34);
			al4.addTrack(t35);
			
			//Lil Pump
			al5.addArtist(a10);
			al5.addTrack(t16);
			al5.addTrack(t17);
			al5.addTrack(t18);
			al5.addTrack(t19);
			al5.addTrack(t20);
			
			//Invasion of Privacy
			al6.addArtist(a13);
			al6.addTrack(t21);
			al6.addTrack(t22);
			al6.addTrack(t23);
			al6.addTrack(t24);
			al6.addTrack(t25);
			
			//Luv is Rage 2
			al7.addArtist(a4);
			al7.addTrack(t26);
			al7.addTrack(t27);
			al7.addTrack(t28);
			al7.addTrack(t29);
			al7.addTrack(t30);

			// Add Albums to list
			albums.add(al1);
			albums.add(al2);
			albums.add(al3);
			albums.add(al4);
			albums.add(al5);
			albums.add(al6);
			albums.add(al7);

			// Playlists
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Album> GetAlbums() {
		return albums;
	}

	public ArrayList<Artist> GetArtists() {
		return artists;
	}

	public ArrayList<Playlist> GetPlaylists() {
		return playlists;
	}

	public ArrayList<Track> getTracks() {
		ArrayList<Track> tracks = new ArrayList<Track>();
		for (Album a : albums) {
			for (Track t : a.getTracks()) {
				tracks.add(t);
			}
		}
		return tracks;
	}

}
