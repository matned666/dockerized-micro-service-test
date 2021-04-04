BEGIN;

SET client_encoding = 'LATIN1';

create table IF NOT EXISTS client_entity (
	id INTEGER NOT NULL   ,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	credit_id INTEGER NOT NULL,
	made_by VARCHAR(100) NOT NULL,
	updated_by VARCHAR(100) NOT NULL,
	create_time DATE NOT NULL,
	update_time DATE NOT NULL
);

create table IF NOT EXISTS credit_entity (
	id INTEGER NOT NULL,
	credit_name VARCHAR(150) NOT NULL,
	made_by VARCHAR(100) NOT NULL,
	updated_by VARCHAR(100) NOT NULL,
	create_time DATE NOT NULL,
	update_time DATE NOT NULL
);

create table IF NOT EXISTS product_entity (
	id INTEGER NOT NULL,
	product_name VARCHAR(200),
	product_value NUMERIC(19, 2) NOT NULL,
	credit_id INTEGER NOT NULL,
	made_by VARCHAR(100) NOT NULL,
	updated_by VARCHAR(100) NOT NULL,
	create_time DATE NOT NULL,
	update_time DATE NOT NULL
);


insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (1, 'Gracia', 'Margach', 1, 'gmargach0@soup.io', 'gmargach0@yale.edu', '1599321193000', '1609113082000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (2, 'Katti', 'Grigs', 2, 'kgrigs1@addtoany.com', 'kgrigs1@fema.gov', '1603375839000', '1603384668000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (3, 'Steven', 'Manilove', 3, 'smanilove2@prlog.org', 'smanilove2@google.co.uk', '1606195821000', '1609370937000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (4, 'Blayne', 'McGrane', 4, 'bmcgrane3@slashdot.org', 'bmcgrane3@prnewswire.com', '1605317070000', '1605602759000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (5, 'Carma', 'Boreland', 5, 'cboreland4@blogtalkradio.com', 'cboreland4@businessinsider.com', '1610754145000', '1604837414000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (6, 'Evvie', 'Passe', 6, 'epasse5@nationalgeographic.com', 'epasse5@biglobe.ne.jp', '1615984119000', '1615989377000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (7, 'Magdalene', 'Westover', 7, 'mwestover6@list-manage.com', 'mwestover6@cam.ac.uk', '1603614047000', '1600960467000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (8, 'Wilbert', 'Nuton', 8, 'wnuton7@reddit.com', 'wnuton7@baidu.com', '1593164259000', '1607644305000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (9, 'Belle', 'Cotterill', 9, 'bcotterill8@issuu.com', 'bcotterill8@mediafire.com', '1591563854000', '1596161177000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (10, 'Redford', 'Ridwood', 10, 'rridwood9@ucsd.edu', 'rridwood9@hatena.ne.jp', '1615474490000', '1617953258000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (11, 'Marieann', 'McGillecole', 11, 'mmcgillecolea@quantcast.com', 'mmcgillecolea@cam.ac.uk', '1614067768000', '1609622984000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (12, 'Brigit', 'Boice', 12, 'bboiceb@miitbeian.gov.cn', 'bboiceb@diigo.com', '1600477697000', '1607806697000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (13, 'Ericka', 'Bayly', 13, 'ebaylyc@ucsd.edu', 'ebaylyc@ucsd.edu', '1588729601000', '1602076482000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (14, 'Jewel', 'Sorey', 14, 'jsoreyd@webs.com', 'jsoreyd@umich.edu', '1599017489000', '1596102718000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (15, 'Danya', 'MacMoyer', 15, 'dmacmoyere@ucoz.ru', 'dmacmoyere@guardian.co.uk', '1594851840000', '1587855591000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (16, 'Melessa', 'Hardwicke', 16, 'mhardwickef@samsung.com', 'mhardwickef@sourceforge.net', '1596044147000', '1596743779000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (17, 'Janek', 'Filipputti', 17, 'jfilipputtig@nbcnews.com', 'jfilipputtig@parallels.com', '1612245119000', '1593034284000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (18, 'Pierrette', 'Watkiss', 18, 'pwatkissh@netvibes.com', 'pwatkissh@sfgate.com', '1602656035000', '1606064460000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (19, 'Raeann', 'Heel', 19, 'rheeli@state.gov', 'rheeli@parallels.com', '1587092805000', '1586810100000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (20, 'Brittaney', 'Lichtfoth', 20, 'blichtfothj@acquirethisname.com', 'blichtfothj@newsvine.com', '1598619497000', '1599183165000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (21, 'Markus', 'Cornewell', 21, 'mcornewellk@clickbank.net', 'mcornewellk@sphinn.com', '1591701496000', '1599392325000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (22, 'Thalia', 'Mather', 22, 'tmatherl@dyndns.org', 'tmatherl@intel.com', '1587250297000', '1598803999000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (23, 'Staci', 'Epsly', 23, 'sepslym@newsvine.com', 'sepslym@amazon.co.uk', '1585966668000', '1607006733000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (24, 'Hedwiga', 'Ferrieres', 24, 'hferrieresn@jimdo.com', 'hferrieresn@cnet.com', '1604508925000', '1602427710000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (25, 'Even', 'Larraway', 25, 'elarrawayo@dailymail.co.uk', 'elarrawayo@virginia.edu', '1591020789000', '1604012514000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (26, 'Athene', 'Hartrick', 26, 'ahartrickp@bravesites.com', 'ahartrickp@usgs.gov', '1603211497000', '1594637803000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (27, 'Holmes', 'Filde', 27, 'hfildeq@scribd.com', 'hfildeq@cbslocal.com', '1611974208000', '1610021724000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (28, 'Ronnica', 'Forster', 28, 'rforsterr@sfgate.com', 'rforsterr@wsj.com', '1591974306000', '1607141480000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (29, 'Sonny', 'Stedman', 29, 'sstedmans@msu.edu', 'sstedmans@virginia.edu', '1610444246000', '1593370097000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (30, 'Theresita', 'De Zamudio', 30, 'tdezamudiot@comsenz.com', 'tdezamudiot@prnewswire.com', '1613998116000', '1597247359000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (31, 'Jammal', 'Tayloe', 31, 'jtayloeu@unblog.fr', 'jtayloeu@sbwire.com', '1588452698000', '1609828679000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (32, 'Gabie', 'Baccas', 32, 'gbaccasv@hud.gov', 'gbaccasv@msn.com', '1588124899000', '1587825566000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (33, 'Kermit', 'Gounel', 33, 'kgounelw@comsenz.com', 'kgounelw@slate.com', '1604013460000', '1607084948000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (34, 'Sada', 'Bernaciak', 34, 'sbernaciakx@fda.gov', 'sbernaciakx@ox.ac.uk', '1589122839000', '1602169111000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (35, 'Clemence', 'Howgill', 35, 'chowgilly@ft.com', 'chowgilly@bravesites.com', '1612369389000', '1591922792000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (36, 'Ginnifer', 'Jillins', 36, 'gjillinsz@naver.com', 'gjillinsz@aboutads.info', '1609332787000', '1596318754000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (37, 'Kiersten', 'Gilogly', 37, 'kgilogly10@typepad.com', 'kgilogly10@loc.gov', '1600014440000', '1587333060000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (38, 'Agnella', 'Finan', 38, 'afinan11@webnode.com', 'afinan11@4shared.com', '1589935839000', '1599593456000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (39, 'Angel', 'Willsmore', 39, 'awillsmore12@thetimes.co.uk', 'awillsmore12@cam.ac.uk', '1596542818000', '1597542200000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (40, 'Merci', 'Pettet', 40, 'mpettet13@phoca.cz', 'mpettet13@sogou.com', '1617469227000', '1610088408000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (41, 'Stefanie', 'Forestall', 41, 'sforestall14@cdc.gov', 'sforestall14@geocities.jp', '1598586470000', '1604458958000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (42, 'Felice', 'Nelson', 42, 'fnelson15@jigsy.com', 'fnelson15@digg.com', '1603069954000', '1602402812000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (43, 'Viva', 'Licciardo', 43, 'vlicciardo16@so-net.ne.jp', 'vlicciardo16@ed.gov', '1610339880000', '1608223822000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (44, 'Rebeca', 'Drivers', 44, 'rdrivers17@ucoz.com', 'rdrivers17@hatena.ne.jp', '1595483684000', '1593146760000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (45, 'Wolfie', 'Tevlin', 45, 'wtevlin18@ucsd.edu', 'wtevlin18@yandex.ru', '1600691988000', '1589335670000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (46, 'Carline', 'Filipponi', 46, 'cfilipponi19@wordpress.org', 'cfilipponi19@php.net', '1607806168000', '1587177157000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (47, 'Augustine', 'Hugin', 47, 'ahugin1a@tripod.com', 'ahugin1a@friendfeed.com', '1609990129000', '1594435647000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (48, 'Griffith', 'Dorking', 48, 'gdorking1b@icq.com', 'gdorking1b@un.org', '1594821889000', '1610268313000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (49, 'Alisa', 'Yackiminie', 49, 'ayackiminie1c@marketwatch.com', 'ayackiminie1c@hhs.gov', '1594334945000', '1613764289000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (50, 'Tiphany', 'Smeall', 50, 'tsmeall1d@google.com.au', 'tsmeall1d@wufoo.com', '1593508482000', '1614866741000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (51, 'Jess', 'Greening', 51, 'jgreening1e@sina.com.cn', 'jgreening1e@qq.com', '1592048572000', '1611905840000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (52, 'Lorri', 'Hawton', 52, 'lhawton1f@istockphoto.com', 'lhawton1f@youku.com', '1612045926000', '1589146503000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (53, 'Raye', 'Parks', 53, 'rparks1g@cloudflare.com', 'rparks1g@cam.ac.uk', '1609618752000', '1612737644000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (54, 'Rudie', 'Gillott', 54, 'rgillott1h@github.io', 'rgillott1h@123-reg.co.uk', '1615229239000', '1597043767000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (55, 'Anne-marie', 'Ludman', 55, 'aludman1i@goo.gl', 'aludman1i@storify.com', '1610387260000', '1588956905000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (56, 'Bo', 'Toma', 56, 'btoma1j@seesaa.net', 'btoma1j@icio.us', '1586647594000', '1615346212000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (57, 'Donia', 'Labat', 57, 'dlabat1k@fc2.com', 'dlabat1k@yellowpages.com', '1602765636000', '1604624352000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (58, 'Glory', 'Corkett', 58, 'gcorkett1l@about.me', 'gcorkett1l@typepad.com', '1597468406000', '1586589529000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (59, 'Dari', 'Rolf', 59, 'drolf1m@cornell.edu', 'drolf1m@jigsy.com', '1603492407000', '1599219442000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (60, 'Christian', 'Creyke', 60, 'ccreyke1n@pcworld.com', 'ccreyke1n@google.co.jp', '1589036067000', '1599565464000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (61, 'Cleon', 'Bereford', 61, 'cbereford1o@nydailynews.com', 'cbereford1o@nyu.edu', '1595169724000', '1598326134000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (62, 'Rube', 'Scay', 62, 'rscay1p@bigcartel.com', 'rscay1p@shutterfly.com', '1594294230000', '1617022636000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (63, 'Sonny', 'Dorset', 63, 'sdorset1q@drupal.org', 'sdorset1q@i2i.jp', '1596216458000', '1607838303000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (64, 'Annora', 'Tomsett', 64, 'atomsett1r@cmu.edu', 'atomsett1r@phoca.cz', '1602413756000', '1600882403000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (65, 'Zacherie', 'Richarz', 65, 'zricharz1s@yellowpages.com', 'zricharz1s@usda.gov', '1594295264000', '1589662286000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (66, 'Melinda', 'Sneyd', 66, 'msneyd1t@uol.com.br', 'msneyd1t@mashable.com', '1592063858000', '1609541547000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (67, 'Cash', 'Forestel', 67, 'cforestel1u@pagesperso-orange.fr', 'cforestel1u@biglobe.ne.jp', '1593153450000', '1608603439000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (68, 'Jeffrey', 'Drewett', 68, 'jdrewett1v@sun.com', 'jdrewett1v@delicious.com', '1602345222000', '1599338880000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (69, 'Gunar', 'Gyford', 69, 'ggyford1w@shop-pro.jp', 'ggyford1w@tripadvisor.com', '1607759317000', '1603661707000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (70, 'Hebert', 'Mongain', 70, 'hmongain1x@blogspot.com', 'hmongain1x@google.co.jp', '1610584409000', '1608472096000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (71, 'Donavon', 'Harron', 71, 'dharron1y@bizjournals.com', 'dharron1y@gizmodo.com', '1587968378000', '1612493799000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (72, 'Magdalena', 'Puvia', 72, 'mpuvia1z@yandex.ru', 'mpuvia1z@wordpress.com', '1590828570000', '1586186643000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (73, 'Estel', 'Lorking', 73, 'elorking20@squarespace.com', 'elorking20@fda.gov', '1592901150000', '1590048117000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (74, 'Sheffield', 'Garlee', 74, 'sgarlee21@sciencedirect.com', 'sgarlee21@reuters.com', '1607614484000', '1595514838000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (75, 'Kip', 'Finan', 75, 'kfinan22@slideshare.net', 'kfinan22@dell.com', '1596095807000', '1588803357000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (76, 'Heddi', 'Kinnerk', 76, 'hkinnerk23@pcworld.com', 'hkinnerk23@dagondesign.com', '1598996884000', '1592660465000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (77, 'Haskell', 'Staggs', 77, 'hstaggs24@bbb.org', 'hstaggs24@tripod.com', '1586280255000', '1600847309000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (78, 'Melosa', 'Murfill', 78, 'mmurfill25@jugem.jp', 'mmurfill25@house.gov', '1601204027000', '1599292514000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (79, 'Linet', 'Hicken', 79, 'lhicken26@upenn.edu', 'lhicken26@soundcloud.com', '1602044802000', '1594550550000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (80, 'Jennette', 'Fairtlough', 80, 'jfairtlough27@weather.com', 'jfairtlough27@cnn.com', '1603875766000', '1600393979000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (81, 'Janella', 'Callaway', 81, 'jcallaway28@people.com.cn', 'jcallaway28@biblegateway.com', '1610064246000', '1598212570000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (82, 'Clim', 'Visco', 82, 'cvisco29@wikimedia.org', 'cvisco29@apple.com', '1614920317000', '1615864917000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (83, 'Tiffany', 'Kmietsch', 83, 'tkmietsch2a@dot.gov', 'tkmietsch2a@cdbaby.com', '1604486407000', '1600569571000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (84, 'Ambur', 'Pettersen', 84, 'apettersen2b@soup.io', 'apettersen2b@qq.com', '1607582608000', '1609242616000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (85, 'Yulma', 'Clapison', 85, 'yclapison2c@ifeng.com', 'yclapison2c@odnoklassniki.ru', '1589159984000', '1613411424000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (86, 'Wini', 'Parker', 86, 'wparker2d@google.com.hk', 'wparker2d@themeforest.net', '1614660955000', '1588396785000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (87, 'Ram', 'Minet', 87, 'rminet2e@infoseek.co.jp', 'rminet2e@examiner.com', '1613430876000', '1596678581000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (88, 'Jyoti', 'Matejka', 88, 'jmatejka2f@java.com', 'jmatejka2f@pinterest.com', '1611693566000', '1607576831000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (89, 'Caroljean', 'Vick', 89, 'cvick2g@omniture.com', 'cvick2g@newyorker.com', '1613123364000', '1587450660000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (90, 'Alexi', 'Kolodziej', 90, 'akolodziej2h@google.nl', 'akolodziej2h@ehow.com', '1615702747000', '1586239435000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (91, 'Jilleen', 'Schlagman', 91, 'jschlagman2i@tamu.edu', 'jschlagman2i@cdc.gov', '1610191903000', '1588249428000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (92, 'Bertine', 'Christer', 92, 'bchrister2j@squarespace.com', 'bchrister2j@weather.com', '1606328569000', '1607632972000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (93, 'Arden', 'Carneck', 93, 'acarneck2k@posterous.com', 'acarneck2k@harvard.edu', '1592666401000', '1602973415000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (94, 'Tadeo', 'Winscum', 94, 'twinscum2l@whitehouse.gov', 'twinscum2l@mysql.com', '1588096616000', '1596177101000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (95, 'Bev', 'Monte', 95, 'bmonte2m@reference.com', 'bmonte2m@hexun.com', '1594968366000', '1617505560000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (96, 'Alica', 'Karpets', 96, 'akarpets2n@scribd.com', 'akarpets2n@booking.com', '1605487208000', '1590161075000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (97, 'Willabella', 'Feek', 97, 'wfeek2o@msn.com', 'wfeek2o@linkedin.com', '1616755632000', '1609855289000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (98, 'Jillayne', 'Donohue', 98, 'jdonohue2p@blinklist.com', 'jdonohue2p@surveymonkey.com', '1602809006000', '1594022466000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (99, 'Daffy', 'Banting', 99, 'dbanting2q@infoseek.co.jp', 'dbanting2q@reference.com', '1613306831000', '1594115039000');
insert into client_entity (id, first_name, last_name, credit_id, made_by, updated_by, create_time, update_time) values (100, 'Iolanthe', 'Campany', 100, 'icampany2r@ustream.tv', 'icampany2r@state.tx.us', '1601809847000', '1610447666000');


insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (1, 'jcb', 'wcorran0@yahoo.co.jp', 'jwallworth0@telegraph.co.uk', '1606379768000', '1589000702000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (2, 'jcb', 'hirnis1@icq.com', 'hblumfield1@netlog.com', '1586191492000', '1586199188000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (3, 'maestro', 'epicopp2@wsj.com', 'dronchi2@cargocollective.com', '1611447079000', '1589388503000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (4, 'jcb', 'cellcome3@stanford.edu', 'uollett3@sbwire.com', '1601670931000', '1590707932000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (5, 'switch', 'mbirchall4@nih.gov', 'roffield4@wufoo.com', '1597765357000', '1587138792000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (6, 'visa', 'normston5@salon.com', 'bdowley5@dailymail.co.uk', '1591187540000', '1600531954000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (7, 'jcb', 'otrevethan6@chicagotribune.com', 'mrackstraw6@creativecommons.org', '1600008224000', '1595667040000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (8, 'americanexpress', 'cwinters7@lulu.com', 'gcatt7@blogger.com', '1598723614000', '1593675144000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (9, 'visa', 'jmingay8@fotki.com', 'jbunclark8@fema.gov', '1589737172000', '1608194619000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (10, 'switch', 'nguswell9@addtoany.com', 'stallon9@scientificamerican.com', '1608820122000', '1615620243000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (11, 'bankcard', 'cprattina@hexun.com', 'chandroka@etsy.com', '1602119430000', '1605825569000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (12, 'mastercard', 'hnajafianb@un.org', 'cblaesb@reuters.com', '1592943849000', '1597610189000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (13, 'mastercard', 'edadgec@usatoday.com', 'ldaskiewiczc@washington.edu', '1607646437000', '1587878224000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (14, 'jcb', 'jfratczakd@live.com', 'gmittond@instagram.com', '1611784692000', '1616878534000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (15, 'jcb', 'fscrinagee@vimeo.com', 'pwinterbottome@shareasale.com', '1606450450000', '1606417529000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (16, 'jcb', 'nlabastidaf@phoca.cz', 'sboyntonf@t-online.de', '1613804799000', '1616851535000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (17, 'jcb', 'lmccawg@comsenz.com', 'kblondelleg@weibo.com', '1592179406000', '1600140304000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (18, 'jcb', 'jdechastelainh@ebay.com', 'eternouthh@nyu.edu', '1599128548000', '1603330615000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (19, 'solo', 'ijoslyni@delicious.com', 'tbeswicki@forbes.com', '1617376717000', '1596774232000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (20, 'bankcard', 'aanderssonj@xing.com', 'lkinningleyj@ted.com', '1609865924000', '1603797498000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (21, 'jcb', 'aungerechtk@photobucket.com', 'wredbornk@soup.io', '1600695964000', '1602772784000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (22, 'switch', 'showelll@tripod.com', 'bsancraftl@reverbnation.com', '1587296573000', '1594087317000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (23, 'diners-club-carte-blanche', 'btrustriem@yelp.com', 'mmcgillicuddym@economist.com', '1588994286000', '1598204330000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (24, 'jcb', 'ckyttern@ezinearticles.com', 'tgatelyn@yolasite.com', '1616359597000', '1586536494000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (25, 'jcb', 'jwatfordo@typepad.com', 'lklugmano@hubpages.com', '1613299681000', '1608041054000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (26, 'diners-club-enroute', 'clewsonp@scribd.com', 'shurchep@unblog.fr', '1592261428000', '1589794686000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (27, 'diners-club-carte-blanche', 'dmccallionq@mediafire.com', 'dgorhamq@mapquest.com', '1607292096000', '1607609994000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (28, 'jcb', 'rcazinr@bluehost.com', 'cfrapwellr@google.nl', '1587637735000', '1616707257000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (29, 'china-unionpay', 'sduchatels@desdev.cn', 'mbenneyworths@360.cn', '1605415868000', '1595226127000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (30, 'maestro', 'dchapet@google.nl', 'mguidonit@washington.edu', '1605334645000', '1598219051000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (31, 'jcb', 'rroutledgeu@shop-pro.jp', 'ewintringhamu@go.com', '1609877211000', '1589090681000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (32, 'jcb', 'abinghamv@opera.com', 'mfransesv@ucsd.edu', '1609598535000', '1610266256000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (33, 'solo', 'hlovartw@mail.ru', 'cboeckw@soundcloud.com', '1587013355000', '1605631912000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (34, 'jcb', 'rgreggersenx@apple.com', 'jfreakx@reverbnation.com', '1598477830000', '1586010388000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (35, 'maestro', 'jsheachy@google.com.br', 'hjeynessy@diigo.com', '1587528477000', '1613285943000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (36, 'china-unionpay', 'mschofflerz@engadget.com', 'glyndonz@cocolog-nifty.com', '1606653924000', '1603643916000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (37, 'maestro', 'esictornes10@mozilla.org', 'psimonsen10@dell.com', '1599681324000', '1587232654000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (38, 'maestro', 'tlarosa11@photobucket.com', 'ismales11@omniture.com', '1610034313000', '1615417626000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (39, 'maestro', 'nasser12@aol.com', 'mfearnill12@posterous.com', '1593185524000', '1586719778000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (40, 'bankcard', 'wlankester13@answers.com', 'cgolton13@slate.com', '1600338958000', '1595266177000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (41, 'jcb', 'ljessop14@freewebs.com', 'tdiable14@dagondesign.com', '1593844982000', '1596948665000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (42, 'switch', 'jdaspar15@bbc.co.uk', 'nboerderman15@nih.gov', '1601153613000', '1593227037000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (43, 'diners-club-carte-blanche', 'gbrinkworth16@nydailynews.com', 'rcardno16@addtoany.com', '1594008538000', '1610384555000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (44, 'americanexpress', 'pwaslin17@amazonaws.com', 'bmacgrath17@patch.com', '1610266643000', '1586113141000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (45, 'maestro', 'kburgane18@nydailynews.com', 'lhenden18@washingtonpost.com', '1611192399000', '1587200246000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (46, 'laser', 'tphalip19@senate.gov', 'sheiton19@homestead.com', '1604629639000', '1616578193000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (47, 'jcb', 'ltomenson1a@qq.com', 'aleahy1a@nps.gov', '1609525124000', '1594251215000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (48, 'jcb', 'jlett1b@miibeian.gov.cn', 'wsnelgar1b@goo.ne.jp', '1593104460000', '1610809462000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (49, 'china-unionpay', 'bhowchin1c@constantcontact.com', 'jreily1c@usda.gov', '1615843907000', '1603795036000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (50, 'jcb', 'bsweeten1d@weibo.com', 'zpeinke1d@etsy.com', '1602854169000', '1605540999000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (51, 'bankcard', 'besler1e@google.com', 'eheavyside1e@boston.com', '1602814336000', '1588012392000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (52, 'china-unionpay', 'zbousfield1f@irs.gov', 'cbachellier1f@privacy.gov.au', '1586458216000', '1600319002000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (53, 'visa-electron', 'fswyersexey1g@noaa.gov', 'bpettet1g@sbwire.com', '1595129644000', '1589388998000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (54, 'solo', 'bitzkov1h@histats.com', 'dketcher1h@geocities.com', '1587532706000', '1605825439000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (55, 'jcb', 'ilewry1i@va.gov', 'gshelliday1i@google.ru', '1603450202000', '1594385461000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (56, 'jcb', 'tcaser1j@fda.gov', 'aivkovic1j@sciencedaily.com', '1603715051000', '1617775728000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (57, 'jcb', 'tmcginley1k@nifty.com', 'lcroxley1k@ed.gov', '1607190849000', '1586295175000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (58, 'jcb', 'dsaywood1l@digg.com', 'ballabarton1l@bbc.co.uk', '1592206644000', '1600857463000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (59, 'jcb', 'sosgodby1m@cargocollective.com', 'hleeds1m@noaa.gov', '1614694911000', '1610158842000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (60, 'diners-club-enroute', 'rwoodyeare1n@hostgator.com', 'lpietrzyk1n@xinhuanet.com', '1589161876000', '1600109675000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (61, 'jcb', 'jstorch1o@people.com.cn', 'clonglands1o@unblog.fr', '1594736436000', '1587916378000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (62, 'mastercard', 'akarolewski1p@oakley.com', 'mbattabee1p@admin.ch', '1613891950000', '1596702261000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (63, 'jcb', 'sdrable1q@nyu.edu', 'ebodiam1q@fc2.com', '1605150086000', '1609714130000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (64, 'maestro', 'lbenka1r@unc.edu', 'mblackstone1r@fda.gov', '1599462570000', '1617228316000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (65, 'jcb', 'srayner1s@narod.ru', 'cplume1s@bbb.org', '1596380840000', '1600881233000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (66, 'visa', 'csalling1t@flavors.me', 'apriestland1t@cyberchimps.com', '1586944607000', '1609985324000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (67, 'laser', 'vkibard1u@123-reg.co.uk', 'rgalier1u@spotify.com', '1601684354000', '1610742722000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (68, 'diners-club-enroute', 'mffrenchbeytagh1v@dedecms.com', 'bmathe1v@tripod.com', '1614865152000', '1602018848000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (69, 'diners-club-carte-blanche', 'wschuchmacher1w@google.ru', 'cmastrantone1w@state.gov', '1616319518000', '1601776976000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (70, 'americanexpress', 'cluck1x@123-reg.co.uk', 'lgiacomuzzi1x@edublogs.org', '1597893490000', '1608680365000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (71, 'jcb', 'enelligan1y@diigo.com', 'ccollelton1y@arizona.edu', '1600333660000', '1604800088000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (72, 'mastercard', 'emackenzie1z@theatlantic.com', 'cmillward1z@nifty.com', '1603695227000', '1596282439000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (73, 'visa-electron', 'krizzardi20@youku.com', 'gwickwar20@tamu.edu', '1587682041000', '1606247614000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (74, 'visa-electron', 'dreed21@rambler.ru', 'tdearnaley21@senate.gov', '1605092372000', '1590119092000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (75, 'mastercard', 'ghasard22@barnesandnoble.com', 'tbrayford22@nasa.gov', '1609539704000', '1605803862000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (76, 'jcb', 'mgillott23@blinklist.com', 'vscheffel23@dion.ne.jp', '1596630826000', '1587800404000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (77, 'laser', 'rdone24@ftc.gov', 'dmccreedy24@unblog.fr', '1591927005000', '1587354934000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (78, 'switch', 'dlemanu25@europa.eu', 'mcaseley25@themeforest.net', '1586846492000', '1590280253000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (79, 'switch', 'amarlin26@nba.com', 'bburril26@umn.edu', '1600761496000', '1612632038000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (80, 'diners-club-carte-blanche', 'shaw27@hhs.gov', 'cnormington27@discuz.net', '1603718824000', '1614522121000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (81, 'jcb', 'jlimbert28@ebay.com', 'nfibbens28@goodreads.com', '1598610548000', '1597599650000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (82, 'maestro', 'dkleine29@abc.net.au', 'scordle29@slideshare.net', '1596425768000', '1607411655000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (83, 'jcb', 'awhitehead2a@yahoo.co.jp', 'mblackah2a@ucsd.edu', '1603538448000', '1587252826000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (84, 'maestro', 'gmacleese2b@berkeley.edu', 'jvalente2b@ft.com', '1610714325000', '1588893498000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (85, 'mastercard', 'ugillitt2c@netvibes.com', 'aeasseby2c@cnbc.com', '1598455754000', '1601023458000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (86, 'maestro', 'lsanbrook2d@creativecommons.org', 'lgrimestone2d@berkeley.edu', '1605014616000', '1611881441000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (87, 'jcb', 'rhowe2e@wsj.com', 'jhilhouse2e@typepad.com', '1597317542000', '1610721919000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (88, 'jcb', 'tswinney2f@reference.com', 'ryoskowitz2f@hostgator.com', '1614847204000', '1614227116000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (89, 'china-unionpay', 'cewings2g@gmpg.org', 'dburdas2g@github.com', '1606433772000', '1587892558000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (90, 'jcb', 'eflipsen2h@ca.gov', 'mtreamayne2h@ebay.co.uk', '1616425717000', '1599621340000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (91, 'jcb', 'bverrechia2i@dell.com', 'lsmithyman2i@merriam-webster.com', '1616725946000', '1593555873000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (92, 'jcb', 'abateman2j@msu.edu', 'mauten2j@posterous.com', '1606348560000', '1615274357000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (93, 'jcb', 'hvanne2k@slate.com', 'vheffron2k@wix.com', '1616707225000', '1603146518000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (94, 'china-unionpay', 'ariddiough2l@mail.ru', 'mblencowe2l@spotify.com', '1600484127000', '1602373133000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (95, 'laser', 'vwonfor2m@indiegogo.com', 'vleslie2m@xing.com', '1603566709000', '1602720063000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (96, 'jcb', 'afippe2n@google.co.jp', 'bellesworth2n@is.gd', '1593428794000', '1612796088000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (97, 'maestro', 'dgrayshan2o@examiner.com', 'iladds2o@businessinsider.com', '1593842845000', '1593131440000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (98, 'maestro', 'pdulwitch2p@tinyurl.com', 'lovett2p@furl.net', '1602005469000', '1617159036000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (99, 'jcb', 'kesmond2q@uiuc.edu', 'mburner2q@wired.com', '1606499044000', '1596144308000');
insert into credit_entity (id, credit_name, made_by, updated_by, create_time, update_time) values (100, 'jcb', 'zbeaby2r@hexun.com', 'mdestoop2r@sbwire.com', '1603800172000', '1599409912000');

insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (1, 'Technology', '€7755,78', 1, 'afierman0@usda.gov', 'lpatten0@freewebs.com', '1607131636000', '1603144333000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (2, 'Public Utilities', '€42447,50', 2, 'smctrustam1@mac.com', 'rpetican1@vistaprint.com', '1593797508000', '1604588763000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (3, 'Consumer Services', '€19044,58', 3, 'mdemanuele2@yahoo.co.jp', 'tarbuckle2@photobucket.com', '1603118886000', '1610608503000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (4, 'Finance', '€97653,99', 4, 'broddam3@amazon.co.uk', 'gbrodbin3@symantec.com', '1612495375000', '1615513749000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (5, 'Consumer Services', '€84779,79', 5, 'menright4@fc2.com', 'shincham4@intel.com', '1590962933000', '1593011207000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (6, 'Energy', '€61760,65', 6, 'mcondit5@earthlink.net', 'dcrollman5@hud.gov', '1589711776000', '1608179965000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (7, 'n/a', '€77818,60', 7, 'knaris6@nhs.uk', 'usteger6@google.com.au', '1593713472000', '1604973280000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (8, 'Health Care', '€54433,32', 8, 'hspaight7@tripadvisor.com', 'frahill7@ehow.com', '1595797820000', '1593669610000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (9, 'Finance', '€89950,42', 9, 'rivachyov8@mac.com', 'cafonso8@nature.com', '1589376168000', '1617827593000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (10, 'Health Care', '€99581,91', 10, 'tpacitti9@psu.edu', 'bmcgerr9@facebook.com', '1603795342000', '1587551035000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (11, 'Health Care', '€10490,75', 11, 'cspybeya@about.me', 'gyearrona@imageshack.us', '1597630942000', '1606786448000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (12, 'Consumer Services', '€51193,53', 12, 'jprideb@intel.com', 'fdacheyb@businessinsider.com', '1601151681000', '1587698599000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (13, 'Finance', '€40165,44', 13, 'lrackleyc@goo.gl', 'mlawleec@blog.com', '1615348034000', '1597234607000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (14, 'n/a', '€30128,59', 14, 'pgowand@soup.io', 'bmartinond@ovh.net', '1615518433000', '1587048788000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (15, 'Finance', '€96098,05', 15, 'halbone@bandcamp.com', 'cduffye@java.com', '1616291074000', '1604022197000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (16, 'Consumer Services', '€22766,03', 16, 'lroxburchf@csmonitor.com', 'pivattf@so-net.ne.jp', '1616223127000', '1591504483000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (17, 'Consumer Services', '€33306,59', 17, 'qdominighig@scribd.com', 'jfarnillg@boston.com', '1616469166000', '1600728577000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (18, 'Energy', '€46325,26', 18, 'vhabershawh@yellowpages.com', 'khandfordh@com.com', '1599783335000', '1603988190000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (19, 'Transportation', '€73597,49', 19, 'mlogsdaili@eepurl.com', 'sbartoti@msu.edu', '1603436645000', '1593718609000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (20, 'Consumer Durables', '€7157,31', 20, 'ktantej@histats.com', 'mmuffj@github.com', '1590500633000', '1603674373000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (21, 'Energy', '€17309,81', 21, 'dettelsk@chronoengine.com', 'dcannopk@house.gov', '1615254399000', '1605458453000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (22, 'Capital Goods', '€42599,16', 22, 'lwhytockl@tamu.edu', 'ogodferyl@imdb.com', '1615074045000', '1615120307000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (23, 'Health Care', '€1024,14', 23, 'kmacconaghym@tripadvisor.com', 'dlemonnierm@github.com', '1614931380000', '1589737285000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (24, 'Technology', '€42327,81', 24, 'prenfreen@senate.gov', 'ealvarn@nymag.com', '1615535390000', '1588822932000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (25, 'Finance', '€12704,74', 25, 'hroyalo@psu.edu', 'ekiesselo@tinyurl.com', '1597068460000', '1597765215000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (26, 'Miscellaneous', '€70336,35', 26, 'ashoesmithp@hhs.gov', 'cuvedalep@last.fm', '1588081237000', '1607546947000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (27, 'Miscellaneous', '€53028,46', 27, 'cgonq@github.io', 'gbonafantq@pcworld.com', '1616044904000', '1603763213000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (28, 'Finance', '€68172,92', 28, 'bmoyseyr@patch.com', 'shordler@amazonaws.com', '1590604769000', '1596851336000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (29, 'Capital Goods', '€11855,24', 29, 'mshears@cbc.ca', 'rpoplees@vimeo.com', '1603961257000', '1615904170000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (30, 'Miscellaneous', '€61928,77', 30, 'ggerdest@uol.com.br', 'theasmant@php.net', '1590290014000', '1613117084000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (31, 'Finance', '€92506,03', 31, 'hfalveyu@admin.ch', 'dgossu@yandex.ru', '1600339925000', '1604096704000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (32, 'Energy', '€55589,10', 32, 'llebanv@zimbio.com', 'yteallv@tmall.com', '1602751017000', '1613413104000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (33, 'n/a', '€81201,72', 33, 'gdowneyw@vistaprint.com', 'mliggettw@msu.edu', '1587604786000', '1612874303000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (34, 'Capital Goods', '€97530,98', 34, 'asextiex@linkedin.com', 'ccanex@eventbrite.com', '1600113721000', '1613230877000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (35, 'Finance', '€34321,84', 35, 'chardikery@sitemeter.com', 'rhutsbyy@jigsy.com', '1597074878000', '1608808981000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (36, 'n/a', '€66103,47', 36, 'ajanceyz@virginia.edu', 'fmessengerz@scientificamerican.com', '1592687461000', '1611195969000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (37, 'Health Care', '€76457,19', 37, 'icabbell10@fema.gov', 'mcamplen10@livejournal.com', '1592930674000', '1606578580000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (38, 'Energy', '€73989,03', 38, 'awards11@google.com', 'bdugood11@networkadvertising.org', '1586392158000', '1612813392000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (39, 'n/a', '€63659,89', 39, 'tmeadley12@washington.edu', 'vhunnybun12@sourceforge.net', '1616291886000', '1586835767000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (40, 'n/a', '€54258,65', 40, 'fharriagn13@oracle.com', 'gschwaiger13@xinhuanet.com', '1594765226000', '1598552117000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (41, 'Public Utilities', '€81740,59', 41, 'jvanichkin14@noaa.gov', 'sritzman14@marketwatch.com', '1594615846000', '1605075062000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (42, 'Consumer Durables', '€54984,92', 42, 'nglenfield15@trellian.com', 'cmousley15@soup.io', '1603089470000', '1606004298000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (43, 'Consumer Services', '€39204,34', 43, 'sdominighi16@taobao.com', 'sbunston16@wix.com', '1591193921000', '1597204659000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (44, 'Consumer Services', '€53488,46', 44, 'sblamphin17@springer.com', 'gfiridolfi17@oakley.com', '1610834171000', '1595060136000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (45, 'Technology', '€53699,00', 45, 'hismay18@miibeian.gov.cn', 'cwolford18@nsw.gov.au', '1591853520000', '1616326460000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (46, 'n/a', '€29995,17', 46, 'rjenner19@slate.com', 'dranaghan19@themeforest.net', '1593965830000', '1604640204000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (47, 'n/a', '€80664,04', 47, 'lsesons1a@census.gov', 'adonisi1a@mail.ru', '1606419373000', '1617398106000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (48, 'Finance', '€11962,71', 48, 'dspavon1b@intel.com', 'fbunnell1b@nymag.com', '1590169134000', '1614923797000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (49, 'Capital Goods', '€97781,68', 49, 'kbouskill1c@qq.com', 'bmusicka1c@netscape.com', '1593187793000', '1599697240000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (50, 'Capital Goods', '€47452,95', 50, 'ltesyro1d@trellian.com', 'hpetrazzi1d@canalblog.com', '1594083678000', '1610557143000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (51, 'n/a', '€25028,21', 51, 'lelwyn1e@buzzfeed.com', 'zruggs1e@networkadvertising.org', '1588221734000', '1610478761000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (52, 'Technology', '€17780,54', 52, 'hsancho1f@stumbleupon.com', 'mhumfrey1f@blogspot.com', '1607605523000', '1604363838000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (53, 'Capital Goods', '€20324,39', 53, 'hmathwen1g@slashdot.org', 'adanielian1g@bandcamp.com', '1606416159000', '1615511024000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (54, 'Health Care', '€16808,71', 54, 'mjansey1h@nhs.uk', 'mgertray1h@opera.com', '1609581841000', '1608413870000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (55, 'n/a', '€79734,43', 55, 'forht1i@tmall.com', 'skerford1i@deviantart.com', '1616206739000', '1599221998000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (56, 'n/a', '€78265,61', 56, 'uselbach1j@icio.us', 'vreveland1j@google.com', '1600658713000', '1601826685000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (57, 'n/a', '€6913,16', 57, 'hmunroe1k@google.ca', 'gorkney1k@about.com', '1612305781000', '1599520493000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (58, 'Consumer Non-Durables', '€7472,04', 58, 'csharpley1l@usgs.gov', 'veastwood1l@stumbleupon.com', '1591196828000', '1617048387000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (59, 'n/a', '€41304,55', 59, 'fskeldinge1m@yellowbook.com', 'abyers1m@webnode.com', '1602083006000', '1609729009000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (60, 'Consumer Services', '€26108,94', 60, 'khumberstone1n@cpanel.net', 'gjennick1n@chicagotribune.com', '1591935124000', '1598863288000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (61, 'Technology', '€626,31', 61, 'ppiddocke1o@dyndns.org', 'vgrishanin1o@com.com', '1593556757000', '1606091634000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (62, 'Capital Goods', '€29521,62', 62, 'oofogarty1p@ox.ac.uk', 'mbrosch1p@hud.gov', '1607880127000', '1590942536000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (63, 'Finance', '€1558,93', 63, 'sbuckney1q@hc360.com', 'lbarlow1q@de.vu', '1597171313000', '1611010165000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (64, 'n/a', '€69259,55', 64, 'begginton1r@ebay.com', 'atregent1r@indiegogo.com', '1604701292000', '1588287956000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (65, 'Technology', '€39268,39', 65, 'gchatteris1s@mlb.com', 'jbalchin1s@icq.com', '1605823520000', '1607263210000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (66, 'Miscellaneous', '€27238,18', 66, 'kzamorano1t@salon.com', 'gcamosso1t@yale.edu', '1590608245000', '1593182824000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (67, 'Public Utilities', '€2968,00', 67, 'mniven1u@dedecms.com', 'asnoding1u@mashable.com', '1593913635000', '1597865931000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (68, 'Technology', '€65319,20', 68, 'cbruyett1v@chicagotribune.com', 'bwoolforde1v@about.com', '1600903200000', '1603234900000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (69, 'Finance', '€56225,07', 69, 'sgawkes1w@merriam-webster.com', 'bbuist1w@g.co', '1596034146000', '1592823288000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (70, 'n/a', '€58608,93', 70, 'cbramhill1x@surveymonkey.com', 'dwannes1x@bbb.org', '1590891797000', '1610308509000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (71, 'Transportation', '€9482,04', 71, 'sdomeny1y@comcast.net', 'yappleton1y@tripod.com', '1592009059000', '1597724358000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (72, 'Public Utilities', '€57931,14', 72, 'kgemmell1z@miitbeian.gov.cn', 'aortells1z@1688.com', '1600942367000', '1605095050000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (73, 'Health Care', '€9239,25', 73, 'lpollendine20@bloomberg.com', 'gbaldinotti20@webeden.co.uk', '1616568616000', '1587545977000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (74, 'Consumer Non-Durables', '€23570,60', 74, 'chartright21@reddit.com', 'fwhitticks21@issuu.com', '1612080119000', '1607084859000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (75, 'Finance', '€25673,63', 75, 'jspellar22@pbs.org', 'stitley22@ca.gov', '1586217755000', '1613681741000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (76, 'Health Care', '€91840,40', 76, 'amcgibbon23@hugedomains.com', 'kbusson23@ftc.gov', '1601776756000', '1598780481000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (77, 'Capital Goods', '€39628,76', 77, 'ftweedell24@constantcontact.com', 'ostaggs24@youtu.be', '1597416384000', '1615732431000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (78, 'n/a', '€67946,36', 78, 'jblase25@infoseek.co.jp', 'nleat25@google.com.au', '1601963266000', '1597671674000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (79, 'Finance', '€91685,22', 79, 'bpracy26@google.nl', 'mmattsson26@tumblr.com', '1599025423000', '1615874563000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (80, 'Capital Goods', '€68247,70', 80, 'mdegregoli27@sogou.com', 'mmckie27@tinyurl.com', '1591350378000', '1600906949000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (81, 'n/a', '€10858,84', 81, 'pforeman28@exblog.jp', 'nbenitez28@cisco.com', '1610529501000', '1594197586000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (82, 'Health Care', '€6524,69', 82, 'cmcroberts29@t-online.de', 'aboulter29@java.com', '1598258429000', '1609675055000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (83, 'Finance', '€77141,41', 83, 'cswedeland2a@army.mil', 'jrubra2a@usatoday.com', '1586140779000', '1613561822000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (84, 'Finance', '€50124,84', 84, 'rwieprecht2b@csmonitor.com', 'dwarsap2b@stumbleupon.com', '1598071829000', '1589622354000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (85, 'Finance', '€97561,45', 85, 'wbrumpton2c@samsung.com', 'gcheesworth2c@wix.com', '1595299583000', '1592275555000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (86, 'n/a', '€59432,76', 86, 'bjeffes2d@guardian.co.uk', 'edeppe2d@usatoday.com', '1614925058000', '1586378808000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (87, 'Consumer Services', '€88938,56', 87, 'hlorent2e@bravesites.com', 'dwandrach2e@google.it', '1616322787000', '1604850155000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (88, 'Transportation', '€5273,08', 88, 'afinn2f@drupal.org', 'dmanvell2f@digg.com', '1605283857000', '1602888302000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (89, 'n/a', '€66268,61', 89, 'rsellers2g@comsenz.com', 'alindhe2g@buzzfeed.com', '1599283381000', '1609641017000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (90, 'Finance', '€81568,80', 90, 'sprop2h@xrea.com', 'aomullane2h@flickr.com', '1592911544000', '1602437840000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (91, 'Capital Goods', '€74469,34', 91, 'jpocknoll2i@ft.com', 'bkirrens2i@fastcompany.com', '1606671201000', '1615330474000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (92, 'Miscellaneous', '€97939,46', 92, 'kjobbins2j@ycombinator.com', 'gkeasy2j@google.ru', '1587999778000', '1606760379000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (93, 'n/a', '€67497,30', 93, 'lranaghan2k@amazon.co.jp', 'ptrudgeon2k@china.com.cn', '1601274151000', '1610283489000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (94, 'n/a', '€13000,56', 94, 'mspearman2l@sciencedirect.com', 'mteresi2l@cbc.ca', '1598904764000', '1586879350000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (95, 'Finance', '€71949,91', 95, 'lbadrick2m@opensource.org', 'mpurkess2m@t-online.de', '1599110706000', '1617312319000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (96, 'Public Utilities', '€7855,51', 96, 'zcotelard2n@edublogs.org', 'raffron2n@yahoo.co.jp', '1601368479000', '1616130324000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (97, 'Health Care', '€44423,81', 97, 'njina2o@blogspot.com', 'kkidman2o@ask.com', '1589067347000', '1604965168000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (98, 'Consumer Services', '€59776,54', 98, 'cdekeyser2p@google.es', 'mscrimgeour2p@google.fr', '1617119294000', '1593101044000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (99, 'Consumer Services', '€98750,10', 99, 'ihuburn2q@shutterfly.com', 'apentecust2q@youtu.be', '1597222358000', '1612088850000');
insert into product_entity (id, product_name, product_value, credit_id, made_by, updated_by, create_time, update_time) values (100, 'n/a', '€53392,19', 100, 'oaprahamian2r@blogtalkradio.com', 'jmannooch2r@plala.or.jp', '1615192239000', '1611084472000');

ALTER TABLE ONLY credit_entity
    ADD CONSTRAINT credit_entity_pkey PRIMARY KEY (id);

ALTER TABLE ONLY client_entity
    ADD CONSTRAINT client_entity_pkey PRIMARY KEY (id);

ALTER TABLE ONLY product_entity
    ADD CONSTRAINT product_entity_pkey PRIMARY KEY (id);

ALTER TABLE ONLY client_entity
    ADD CONSTRAINT client_entity_fkey FOREIGN KEY (credit_id) REFERENCES credit_entity(id);

ALTER TABLE ONLY product_entity
    ADD CONSTRAINT product_entity_fkey FOREIGN KEY (credit_id) REFERENCES credit_entity(id);


COMMIT;

ANALYZE credit_entity;
ANALYZE client_entity;
ANALYZE product_entity;