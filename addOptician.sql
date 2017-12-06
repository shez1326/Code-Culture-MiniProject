--
-- Table structure for table `optician`
--

DROP TABLE IF EXISTS `optician`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `optician` (
  `OPTICIANID` int(10) NOT NULL AUTO_INCREMENT,
  `nhs` tinyint(1) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `postcode` varchar(8) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  
  PRIMARY KEY (`OpticianID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `optician`
--

LOCK TABLES `optician` WRITE;
/*!40000 ALTER TABLE `optician` DISABLE KEYS */;
INSERT INTO `optician` VALUES (1,1,"Iris Domiciliary Services","Technology House,GF unit 18/19,2 Lissadel Road,Salford","Salford","M6 6AP","1612782472")
(2,1,"Boots-Blackburn","7 Stonybutts,Blackburn Shopping Centre,,Blackburn","Blackburn","BB1 7JD","1254593923")
(3,1,"Susan Hilton Opticians",",45 Bridge Street,,Darwen","Darwen","BB3 2AA","1234584933")
(4,0,"J E Rainford Ltd","325 Wigan Road,Deane,Bolton,Lancashire","Lancashire","BL3 5QH","1204653649")
(5,1,"Eyeful Tower","45,Duckworth Street,Darwen,Lancashire","Lancashire","BB3 1AR","1254760111")
(6,0,"Darwen Eye Centre","27 Railway Road,,Darwen,Lancashire","Lancashire","BB3 2RG","1254761644")
(7,0,"Crown Eyeglass plc t/a Direkt Optik International","19 - 21 Scot Lane,,Doncaster,South Yorkshire","South Yorkshire","DN1 1EW","1302328761")
(8,1,"Boots-Doncaster - North Bridge Rd","18 - 24 North Bridge Road,,Doncaster,South Yorkshire","South Yorkshire","DN5 9AN","1302321515")
(9,0,"C Lee Domicilary Eyecare","The Birches,Moorhouse,Carlisle,Cumbria","Cumbria","CA5 6EY","1228576641")
(10,0,"Dolores Marchall Opticians","29a Fisher Street,,Carlisle,Cumbria","Cumbria","CA3 8RF","1228409404")
(11,1,"Visualise","73a Blackwell Road,,Carlisle,Cumbria","Cumbria","CA2 4AJ","1228540044")
(12,1,"Asda Vision Centre","Chandler Way,Kingstown,Carlisle,Cumbria","Cumbria","CA3 0JQ","1228526550")
(13,1,"Whitehaven Vision Plus",",45 King Street,Whitehaven,Cumbria","Cumbria","CA28 7JH","1946598190")
(14,0,"Healthcall Optical Services","Unit 3, Bow Court,Fletchworth Gate,Canley,Coventry","Coventry","CV5 6SP","8456017241")
(15,1,"Gilbert Opticians","55 Bridge Street,,Worksop,Nottinghamshire","Nottinghamshire","S80 1DG","1909472506")
(16,0,"Sight Solutions Opticians","109 Green Lane Road,,Leicester,Leicestershire","Leicestershire","LE5 3TP","1162105016")
(17,0,"J E Rainford Ltd","325 Wigan Road,Deane,Bolton,Lancashire","Lancashire","BL3 5QU","1204660406")
(18,1,"Tesco Opticians","Ellesmere Shopping Centre,Walkden,,Manchester","Manchester","M28 3BT","1614513838")
(19,1,"District Opticians","14 Hulton District Centre,Little Hulton,Manchester,",,"M28 0AU","1617037171")
(20,0,"Ladybrook Eyewear","12b Fir Road,Bramhall,Stockport,Cheshire","Cheshire","SK7 2NP","1614396867")
(21,0,"Vision Express","Unit 6-10 Adlington Walk,Off Merseyway,Stockport,Cheshire","Cheshire","SK1 1PR","1614764686")
(22,0,"Schofield Eye Care","57 Godolphin Road,,Helston,Cornwall","Cornwall","TR13 8QB","1326572324")
(23,0,"Modern Opticals Ltd","163 Burnley Road,Padiham,Lancashire,",,"BB12 8BA","1282680456")
(24,0,"Homecall Optical Services (DOM)","42-48 High Street,,London,",,"E18 2QL","2085517512")
(25,0,"Home Eye Care (DOM)","627d Southend Road,Ilford,Essex,",,"IG3 8RG","2085906666")
(26,1,"Eyeworks London",",44 Gloucester Road,,London","London","SW7 4QT","2075842697")
(27,0,"Icon the Opticians (DOM)","23 Southend Road,,London,",,"NW3 2QB","2074355888")
(28,0,"Brian Hitchin (DOM)","Old Viacarage, Radford Street,,,Staffordshore,",,"ST15 8AD","175815656")
(29,0,"Home Visit Optical (DOM)","Po Box 584,Huntingdon,Warboys,",,"PE28 2WR","8456031618")
(30,0,"H A Curran","44 Gloucester Road,,London,",,"SW7 4QT","2075842697")
(31,1,"Catford Specsavers",",130-134 Rushey Green,Catford,London","London","SE6 4HQ","2083142370")
(32,0,"Pearl Vision","134-136 Mitcham Road,Tooting,London,",,"SW17 9NH","2086722158")
(33,0,"Stalybridge Eyecare","47 Melbourne Street,Stalybridge,Cheshire,",,"SK15 2JJ","1613382561")
(34,0,"Vikesh Measuria","28 - 30 Penny Meadow,,Ashton-under-Lyne,Lancashire","Lancashire","OL6 6HG","1613309437")
(35,0,"S W Optics Ltd","University Of Birmingham, University Centre,Edgbaston,Birmingham,",,"B15 2TT","1214142714")
(36,0,"Myoptics Opticians","14 Curdale Road,Bartley Green,Birmingham,",,"B32 4HB","1214754920")
(37,1,"Michael Wolffe","22 Chantry Road,Moseley,Birmingham,Birmingham","Birmingham","B13 8DH","1214491724")
(38,1,"J & D Mason Opticians",",2 The Green,Kings Norton,Birmingham","Birmingham","B38 8SD","1214513485")
(39,1,"J & D Mason Opticians",",18 Farmhouse Way,Shirley,Solihull","Solihull","B90 4EH","1217058139")
(40,0,"Williams Optometrist","8a Oak Tree Lane,Selly Oak,Birmingham,",,"B29 6HX","1214720211")
(41,0,"Specs Direct","871 Bristol Road South,Northfield,Birmingham,",,"B31 2PA","1214777474")
(42,1,"Peter Ian McLauchlan","17 Portland Road,Edgbaston,Birmingham,",,"B16 9HN","1214546307")
(43,1,"Portland Eyecare Services Ltd",",1 Institute Road,Birmingham,Birmingham","Birmingham","B14 7EG","1214444838")
(44,0,"Knights Ophthalmic Opticians","130 Castle Square,Weoley Castle,Birmingham,",,"B29 5QL","1214111555")
(45,1,"Harborne VE LTD",",144 High Street,Harborne,Birmingham","Birmingham","B17 9NP","1214284835")
(46,0,"Budgetspex Ltd","8 Baird House Second Avenue,Pensett Trading Estate,Kingswinford,West Midlands","West Midlands","DY6 7YA","8712503601")
(47,1,"Dolland & Aitchinson","11 Bradford Street,,,Walsall","Walsall","WS1 1PB","1922632070")
(48,1,"Vision Care Direct Opticians",",13 Stafford Street,,Willenhall","Willenhall","WV13 1TG","1902609244")
(49,1,"Eyedeal","212 High Street,Bloxwich,,Walsall","Walsall","WS3 3LA","1922473999")
(50,0,"Sight Savers Eye Centre","94 Linacre Road,,Litherland,Merseyside","Merseyside","L21 6NU","1519333666")
(51,0,"Edwards RG","6 South Wolfe Street,Stoke,Stoke On Trent,Staffordshire","Staffordshire","ST4 4AA","1782848070")
(52,0,"Heath JH","2 Garfield Avenue,Hanford,Stoke On Trent,Staffordshire","Staffordshire","ST4 8ES","1782643999")
(53,0,"Portland Eye Care Ltd","21 Market Street,Longton,Stoke On Trent,Staffordshire","Staffordshire","ST3 1BE","1782319930")
(54,0,"Specsavers Opticians","36-38 Market Street,Longton,Stoke On Trent,Staffordshire","Staffordshire","ST3 1BS","1782337830")
(55,1,"Andrew Martin Optometrist Ltd","66 Boldmere Road,Boldmere,Sutton Coldfield,West Midlands","West Midlands","B73 5TJ","1213546411")
(56,1,"Asda Opticians","Walmley Ash Road,Minworth,,Sutton Coldfield","Sutton Coldfield","B76 1XL","1213137157")
(57,1,"Eye Centre Opticians",",53c Reddicap Heath Road,,Sutton Coldfield","Sutton Coldfield","B75 7DX","1213784724")
(58,1,"Andrew Martin & Associates","244 Lichfield Road,,Sutton Coldfield,West Midlands","West Midlands","B74 2UD","1213081886")
(59,0,"R J Owen Opticians","10 Warren Farm Road,Kingstanding,Birmingham,",,"B44 0QU","1213735790")
(60,1,"Eye Express",",909 Walsall Road,Great Barr,Birmingham","Birmingham",,"1213576465")
(61,1,"Eyes & Vision",",280 Wellington,,Birmingham","Birmingham","B20 2QL","")
(62,1,"Bainbridge Optometrists",",502 Bearwood Road,Smethwick,Birmingham","Birmingham","B66 4BX","1214296006")
(63,1,"Eyeworld Optometrists",",1863 Pershore Road,Cotteridge,Birmingham","Birmingham","B30 3DJ","1214581359")
(64,1,"Rajesh Gogna",",41 Ardav Road,Hilltop,West Bromwich","West Bromwich","B70 0RA","7814789840")
(65,1,"Gurdeep Singh Dhinsa",",24 Beacon Road,,Walsall","Walsall","WS5 3LF","1213573477")
(66,1,"Home Eyecare",",Unit 8, 17 Winyates Centre,,Redditch","Redditch","B98 0NR","1527529010")
(67,1,"Eyecare Mobile Opticians Ltd",",546 Bearwood Road,Smethwick,Birmingham","Birmingham","B66 4BT","1214297752")
(68,1,"Shabbir Kaderbhai",",565 Washwood Heath Road,Ward End,Birmingham","Birmingham","B8 2HB","1213271814")
(69,1,"Brittain Opticians Ltd",",97 High Street,Harborne,Birmingham","Birmingham","B17 9NR","1214271007")
(70,1,"Sanjeev Singh Sanghera",",39 High Street,Lye,Stourbridge","Stourbridge","DY9 8LF","1384422270")
(71,1,"Piccadilly Opticians",",13 Piccadilly Arcade,,Birmingham","Birmingham","B2 4HD","")
(72,1,"Eye Express",",Unit 32, One Stop Shopping Centre,Perry Barr,Birmingham","Birmingham","B42 1AA","1213567115")
(73,1,"Portland Eye Care Services Ltd",",19 New Street,Bridgtown,Cannock","Cannock","WS11 0DD","1543462029")
(74,1,"Mikah Opticians",",941 Alum Rock Road,Ward End,Birmingham","Birmingham","B8 2LX","1212463777")
(75,1,"Eye Sight Centre Opticians",",485 Stratford Road,Sparkhill,Birmingham","Birmingham","B11 4LE","1217711277")
(76,0,"Specs at Home (Midlands) Ltd","20 Woodvale Road,Hall Green,Birmingham,",,"B28 0PH","7813012292")
(77,1,"Cox Opticians",",20 Victoria Road,Aston,Birmingham","Birmingham","B6 5HA","1215070812")
(78,0,"The Spectacle Company","766 Kingstanding Road,Kingstanding,Birmingham,",,"B44 9ST","1213555639")
(79,1,"I M HADFIELD BSc, FCOptom, OPTOMETRISTS","162 Beeches Road,162 Beecehes Road,Birmingham,Birmingham","Birmingham","B42 2HN","1213571748")
(80,1,"D M Eye Clinic",",Unit 2-5 Soho City Shopping Centre,263-265 Soho Road,Birmingham","Birmingham","B21 9RY","1215237337")
(81,1,"Scrivens Ltd",",19 Kingstanding Centre,Kingstanding,Birmingham","Birmingham","B44 9HH","1213542100")
(82,1,"Focus Eye Clinic",",65 Rupert Street,Nechells,Birmingham","Birmingham","B7 5DT","1213592666")
(83,1,"Vernon Walker Opticians Ltd",",unit 21,The Kingstanding Centre,Birmingham","Birmingham","B44 9HH","1213542992")
(84,1,"Shah-Jallal Opticians",",420 Witton Road,,Birmingham","Birmingham","B6 6PP","")
(85,1,"Specs Eye Centre",",127 Holyhead Road,Handsworth,Birmingham","Birmingham","B21 0HH","1215549876")
(86,1,"Shifa Eye Clinic",",512-514 Moseley Road,Balsall Heath,Birmingham","Birmingham","B12 9AH","1214403777")
(87,1,"Eyespec",",340 Coventry Road,Small Heath,Birmingham","Birmingham","B10 0XE","1217721526")
(88,1,"A S Gill Optometrists","537 Stratford Road,Sparkhill,Birmingham,Birmingham","Birmingham","B11 4LP","1217665491")
(89,1,"Eurospex Opticians Ltd",",332 Soho Road,Handsworth,Birmingham","Birmingham","B21 9NA","1215234967")
(90,1,"Eye Opticians Ltd",",44 Islington Row,Edgbaston,Birmingham","Birmingham","B15 1LD","1214565676")
(91,1,"Eye Centre",",289 Dudley Road,Winson Green,Birmingham","Birmingham","B18 4HA","1214546569")
(92,1,"Mohammed Dilwar Khan",",259 Stoney Lane,Balsall Heath,Birmingham","Birmingham","B12 8AR","1214492111")
(93,1,"Gallery Opticians","52e Lozels Road,Lozells,Birmingham,",,"B19 2TJ","1215542563")
(94,1,"Ward (Ophthalmic Opticians) Ltd",",76 Oxhill Road,Handsworth,Birmingham","Birmingham","B21 9RH","1215548949")
(95,1,"Specs Direct",",150 Lozells Road,Lozells,Birmingham","Birmingham","B19 2SX","1215071661")
(96,1,"Opticare Ophthalmic Opticians","150a Ladypool Road,Sparkbrook,Birmingham,",,"B12 8JS","1217713222")
(97,1,"Peter E Waite (Optometrist)",",8 Horton Square,Highgate,Birmingham","Birmingham","B12 0YR","1214401636")
(98,1,"Portland Eye Care Services Ltd",",345 Coventry Road,Small Heath,Birmingham","Birmingham","B10 0SN","1217721442")
(99,1,"Roots Opticians","168 Trinity Road,Aston,Birmingham,",,"B6 6HZ","1213285700")
/*!40000 ALTER TABLE `optician` ENABLE KEYS */;
UNLOCK TABLES;