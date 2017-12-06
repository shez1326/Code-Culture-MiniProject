--
-- Table structure for table `optician`
--

DROP TABLE IF EXISTS `optician`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `optician` (
  `OPTICIANID` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `postcode` varchar(8) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `nhs` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`OpticianID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `optician`
--

LOCK TABLES `optician` WRITE;
/*!40000 ALTER TABLE `optician` DISABLE KEYS */;
INSERT INTO `optician` VALUES (1,"Iris Domiciliary Services","Technology House,GF unit 18/192 Lissadel Road,Salford","Salford","M6 6AP","01612782472",1)
(2,"Boots-Blackburn","7 Stonybutts,Blackburn Shopping Centre,,Blackburn","Blackburn","BB1 7JD","01254593923",1)
(3,"Susan Hilton Opticians","45 Bridge Street,,Darwen","Darwen","BB3 2AA","01234584933",1)
(4,"J E Rainford Ltd","325 Wigan Road,Deane,Bolton,Lancashire","Lancashire","BL3 5QH","01204653649",0)
(5,"Eyeful Tower","45,Duckworth Street,Darwen,Lancashire","Lancashire","BB3 1AR","01254760111",1)
(6,"Darwen Eye Centre","27 Railway Road,,Darwen,Lancashire","Lancashire","BB3 2RG","01254761644",0)
(7,"Crown Eyeglass plc t/a Direkt Optik International","19 - 21 Scot Lane,,Doncaster,South Yorkshire","South Yorkshire","DN1 1EW","01302328761",0)
(8,"Boots-Doncaster - North Bridge Rd","18 - 24 North Bridge Road,,Doncaster,South Yorkshire","South Yorkshire","DN5 9AN","01302321515",1)
(9,"C Lee Domicilary Eyecare","The Birches,Moorhouse,Carlisle,Cumbria","Cumbria","CA5 6EY","01228576641",0)
(10,"Dolores Marchall Opticians","29a Fisher Street,,Carlisle,Cumbria","Cumbria","CA3 8RF","01228409404",0)
(11,"Visualise","73a Blackwell Road,,Carlisle,Cumbria","Cumbria","CA2 4AJ","01228540044",1)
(12,"Asda Vision Centre","Chandler Way,Kingstown,Carlisle,Cumbria","Cumbria","CA3 0JQ","01228526550",1)
(13,"Whitehaven Vision Plus","45 King Street,Whitehaven,Cumbria","Cumbria","CA28 7JH","01946598190",1)
(14,"Healthcall Optical Services","Unit 3, Bow Court,Fletchworth Gate,Canley,Coventry","Coventry","CV5 6SP","08456017241",0)
(15,"Gilbert Opticians","55 Bridge Street,,Worksop,Nottinghamshire","Nottinghamshire","S80 1DG","01909472506",1)
(16,"Sight Solutions Opticians","109 Green Lane Road,,Leicester,Leicestershire","Leicestershire","LE5 3TP","01162105016",0)
(17,"J E Rainford Ltd","325 Wigan Road,Deane,Bolton,Lancashire","Lancashire","BL3 5QU","01204660406",0)
(18,"Tesco Opticians","Ellesmere Shopping Centre,Walkden,,Manchester","Manchester","M28 3BT","01614513838",1)
(19,"District Opticians","14 Hulton District Centre,Little Hulton,Manchester,",,"M28 0AU","01617037171",1)
(20,"Ladybrook Eyewear","12b Fir Road,Bramhall,Stockport,Cheshire","Cheshire","SK7 2NP","01614396867",0)
(21,"Vision Express","Unit 6-10 Adlington Walk,Off Merseyway,Stockport,Cheshire","Cheshire","SK1 1PR","01614764686",0)
(22,"Schofield Eye Care","57 Godolphin Road,,Helston,Cornwall","Cornwall","TR13 8QB","01326572324",0)
(23,"Modern Opticals Ltd","163 Burnley Road,Padiham,Lancashire,",,"BB12 8BA","01282680456",0)
(24,"Homecall Optical Services (DOM)","42-48 High Street,,London,",,"E18 2QL","02085517512",0)
(25,"Home Eye Care (DOM)","627d Southend Road,Ilford,Essex,",,"IG3 8RG","02085906666",0)
(26,"Eyeworks London","44 Gloucester Road,,London","London","SW7 4QT","02075842697",1)
(27,"Icon the Opticians (DOM)","23 Southend Road,,London,",,"NW3 2QB","02074355888",0)
(28,"Brian Hitchin (DOM)","Old Viacarage, Radford Street,,,Staffordshore,",,"ST15 8AD","0175815656",0)
(29,"Home Visit Optical (DOM)","Po Box 584,Huntingdon,Warboys,",,"PE28 2WR","08456031618",0)
(30,"H A Curran","44 Gloucester Road,,London,",,"SW7 4QT","02075842697",0)
(31,"Catford Specsavers","130-134 Rushey Green,Catford,London","London","SE6 4HQ",2083142370,1)
(32,"Pearl Vision","134-136 Mitcham Road,Tooting,London,",,"SW17 9NH","02086722158",0)
(33,"Stalybridge Eyecare","47 Melbourne Street,Stalybridge,Cheshire,",,"SK15 2JJ","01613382561",0)
(34,"Vikesh Measuria","28 - 30 Penny Meadow,,Ashton-under-Lyne,Lancashire","Lancashire","OL6 6HG","01613309437",0)
(35,"S W Optics Ltd","University Of Birmingham, University Centre,Edgbaston,Birmingham,",,"B15 2TT","01214142714",0)
(36,"Myoptics Opticians","14 Curdale Road,Bartley Green,Birmingham,",,"B32 4HB","01214754920",0)
(37,"Michael Wolffe","22 Chantry Road,Moseley,Birmingham,Birmingham","Birmingham","B13 8DH","01214491724",1)
(38,"J & D Mason Opticians","2 The Green,Kings Norton,Birmingham","Birmingham","B38 8SD","01214513485",1)
(39,"J & D Mason Opticians","18 Farmhouse Way,Shirley,Solihull","Solihull","B90 4EH","01217058139",1)
(40,"Williams Optometrist","8a Oak Tree Lane,Selly Oak,Birmingham,",,"B29 6HX","01214720211",0)
(41,"Specs Direct","871 Bristol Road South,Northfield,Birmingham,",,"B31 2PA","01214777474",0)
(42,"Peter Ian McLauchlan","17 Portland Road,Edgbaston,Birmingham,",,"B16 9HN","01214546307",1)
(43,"Portland Eyecare Services Ltd","1 Institute Road,Birmingham,Birmingham","Birmingham","B14 7EG","01214444838",1)
(44,"Knights Ophthalmic Opticians","130 Castle Square,Weoley Castle,Birmingham,",,"B29 5QL","01214111555",0)
(45,"Harborne VE LTD","144 High Street,Harborne,Birmingham","Birmingham","B17 9NP","01214284835",1)
(46,"Budgetspex Ltd","8 Baird House Second Avenue,Pensett Trading Estate,Kingswinford,West Midlands","West Midlands","DY6 7YA","08712503601",0)
(47,"Dolland & Aitchinson","11 Bradford Street,,,Walsall","Walsall","WS1 1PB","01922632070",1)
(48,"Vision Care Direct Opticians","13 Stafford Street,,Willenhall","Willenhall","WV13 1TG","01902609244",1)
(49,"Eyedeal","212 High Street,Bloxwich,,Walsall","Walsall","WS3 3LA","01922473999",1)
(50,"Sight Savers Eye Centre","94 Linacre Road,,Litherland,Merseyside","Merseyside","L21 6NU","01519333666",0)
(51,"Edwards RG","6 South Wolfe Street,Stoke,Stoke On Trent,Staffordshire","Staffordshire","ST4 4AA","01782848070",0)
(52,"Heath JH","2 Garfield Avenue,Hanford,Stoke On Trent,Staffordshire","Staffordshire","ST4 8ES","01782643999",0)
(53,"Portland Eye Care Ltd","21 Market Street,Longton,Stoke On Trent,Staffordshire","Staffordshire","ST3 1BE","01782319930",0)
(54,"Specsavers Opticians","36-38 Market Street,Longton,Stoke On Trent,Staffordshire","Staffordshire","ST3 1BS","01782337830",0)
(55,"Andrew Martin Optometrist Ltd","66 Boldmere Road,Boldmere,Sutton Coldfield,West Midlands","West Midlands","B73 5TJ","01213546411",1)
(56,"Asda Opticians","Walmley Ash Road,Minworth,,Sutton Coldfield","Sutton Coldfield","B76 1XL","01213137157",1)
(57,"Eye Centre Opticians","53c Reddicap Heath Road,,Sutton Coldfield","Sutton Coldfield","B75 7DX","01213784724",1)
(58,"Andrew Martin & Associates","244 Lichfield Road,,Sutton Coldfield,West Midlands","West Midlands","B74 2UD","01213081886",1)
(59,"R J Owen Opticians","10 Warren Farm Road,Kingstanding,Birmingham,",,"B44 0QU","01213735790",0)
(60,"Eye Express","909 Walsall Road,Great Barr,Birmingham","Birmingham",,"01213576465",1)
(61,"Eyes & Vision","280 Wellington,,Birmingham","Birmingham","B20 2QL",,1)
(62,"Bainbridge Optometrists","502 Bearwood Road,Smethwick,Birmingham","Birmingham","B66 4BX","01214296006",1)
(63,"Eyeworld Optometrists","1863 Pershore Road,Cotteridge,Birmingham","Birmingham","B30 3DJ","01214581359",1)
(64,"Rajesh Gogna","41 Ardav Road,Hilltop,West Bromwich","West Bromwich","B70 0RA",7814789840,1)
(65,"Gurdeep Singh Dhinsa","24 Beacon Road,,Walsall","Walsall","WS5 3LF","01213573477",1)
(66,"Home Eyecare",",Unit 8, 17 Winyates Centre,,Redditch","Redditch","B98 0NR","01527529010",1)
(67,"Eyecare Mobile Opticians Ltd","546 Bearwood Road,Smethwick,Birmingham","Birmingham","B66 4BT","01214297752",1)
(68,"Shabbir Kaderbhai","565 Washwood Heath Road,Ward End,Birmingham","Birmingham","B8 2HB","01213271814",1)
(69,"Brittain Opticians Ltd","97 High Street,Harborne,Birmingham","Birmingham","B17 9NR","01214271007",1)
(70,"Sanjeev Singh Sanghera","39 High Street,Lye,Stourbridge","Stourbridge","DY9 8LF","01384422270",1)
(71,"Piccadilly Opticians","13 Piccadilly Arcade,,Birmingham","Birmingham","B2 4HD",,1)
(72,"Eye Express",",Unit 32, One Stop Shopping Centre,Perry Barr,Birmingham","Birmingham","B42 1AA","01213567115",1)
(73,"Portland Eye Care Services Ltd","19 New Street,Bridgtown,Cannock","Cannock","WS11 0DD","01543462029",1)
(74,"Mikah Opticians","941 Alum Rock Road,Ward End,Birmingham","Birmingham","B8 2LX","01212463777",1)
(75,"Eye Sight Centre Opticians","485 Stratford Road,Sparkhill,Birmingham","Birmingham","B11 4LE","01217711277",1)
(76,"Specs at Home (Midlands) Ltd","20 Woodvale Road,Hall Green,Birmingham,",,"B28 0PH","07813012292",0)
(77,"Cox Opticians","20 Victoria Road,Aston,Birmingham","Birmingham","B6 5HA","01215070812",1)
(78,"The Spectacle Company","766 Kingstanding Road,Kingstanding,Birmingham,",,"B44 9ST","01213555639",0)
(79,"I M HADFIELD BSc, FCOptom, OPTOMETRISTS","162 Beeches Road162 Beecehes Road,Birmingham,Birmingham","Birmingham","B42 2HN","01213571748",1)
(80,"D M Eye Clinic",",Unit 2-5 Soho City Shopping Centre263-265 Soho Road,Birmingham","Birmingham","B21 9RY","01215237337",1)
(81,"Scrivens Ltd","19 Kingstanding Centre,Kingstanding,Birmingham","Birmingham","B44 9HH","01213542100",1)
(82,"Focus Eye Clinic","65 Rupert Street,Nechells,Birmingham","Birmingham","B7 5DT","01213592666",1)
(83,"Vernon Walker Opticians Ltd",",unit 21,The Kingstanding Centre,Birmingham","Birmingham","B44 9HH","01213542992",1)
(84,"Shah-Jallal Opticians","420 Witton Road,,Birmingham","Birmingham","B6 6PP",,1)
(85,"Specs Eye Centre","127 Holyhead Road,Handsworth,Birmingham","Birmingham","B21 0HH","01215549876",1)
(86,"Shifa Eye Clinic","512-514 Moseley Road,Balsall Heath,Birmingham","Birmingham","B12 9AH","01214403777",1)
(87,"Eyespec","340 Coventry Road,Small Heath,Birmingham","Birmingham","B10 0XE","01217721526",1)
(88,"A S Gill Optometrists","537 Stratford Road,Sparkhill,Birmingham,Birmingham","Birmingham","B11 4LP","01217665491",1)
(89,"Eurospex Opticians Ltd","332 Soho Road,Handsworth,Birmingham","Birmingham","B21 9NA","01215234967",1)
(90,"Eye Opticians Ltd","44 Islington Row,Edgbaston,Birmingham","Birmingham","B15 1LD","01214565676",1)
(91,"Eye Centre","289 Dudley Road,Winson Green,Birmingham","Birmingham","B18 4HA","01214546569",1)
(92,"Mohammed Dilwar Khan","259 Stoney Lane,Balsall Heath,Birmingham","Birmingham","B12 8AR","01214492111",1)
(93,"Gallery Opticians","52e Lozels Road,Lozells,Birmingham,",,"B19 2TJ","01215542563",1)
(94,"Ward (Ophthalmic Opticians) Ltd","76 Oxhill Road,Handsworth,Birmingham","Birmingham","B21 9RH","01215548949",1)
(95,"Specs Direct","150 Lozells Road,Lozells,Birmingham","Birmingham","B19 2SX","01215071661",1)
(96,"Opticare Ophthalmic Opticians","150a Ladypool Road,Sparkbrook,Birmingham,",,"B12 8JS","01217713222",1)
(97,"Peter E Waite (Optometrist)","8 Horton Square,Highgate,Birmingham","Birmingham","B12 0YR","01214401636",1)
(98,"Portland Eye Care Services Ltd","345 Coventry Road,Small Heath,Birmingham","Birmingham","B10 0SN","01217721442",1)
(99,"Roots Opticians","168 Trinity Road,Aston,Birmingham,",,"B6 6HZ","01213285700",1)
/*!40000 ALTER TABLE `optician` ENABLE KEYS */;
UNLOCK TABLES;