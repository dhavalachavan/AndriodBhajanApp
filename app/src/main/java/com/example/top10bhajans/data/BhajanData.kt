package com.example.top10bhajans.data

data class Bhajan(
    val id: Int,
    val title: String,
    val titleHindi: String,
    val deity: String,
    val youtubeVideoId: String,
    val lyricsEnglish: String,
    val lyricsHindi: String
)

object BhajanRepository {
    val top10Bhajans = listOf(
        Bhajan(
            id = 1,
            title = "Hanuman Chalisa",
            titleHindi = "हनुमान चालीसा",
            deity = "Lord Hanuman",
            youtubeVideoId = "AETFvQonfV8",
            lyricsEnglish = """
                Doha:
                Shri Guru Charan Saroj Raj, Nij Manu Mukuru Sudhari,
                Baranau Raghuvar Bimal Jasu, Jo Dayaku Phala Chari.
                Buddhiheen Tanu Janike, Sumirau Pavan-Kumar,
                Bal Buddhi Vidya Dehu Mohi, Harahu Kalesa Vikar.

                Chaupai:
                Jai Hanuman Gyan Gun Sagar,
                Jai Kapis Tihun Lok Ujagar.
                Ram Doot Atulit Bal Dhama,
                Anjani-Putra Pavan Sut Nama.

                Mahabir Bikram Bajrangi,
                Kumati Nivar Sumati Ke Sangi.
                Kanchan Baran Biraj Subesa,
                Kanan Kundal Kunchit Kesa.

                Hath Bajra Au Dhwaja Birajai,
                Kandhe Moonj Janeu Sajai.
                Sankar Suvan Kesari Nandan,
                Tej Pratap Maha Jag Bandan.

                Vidyavan Guni Ati Chatur,
                Ram Kaj Karibe Ko Aatur.
                Prabhu Charitra Sunibe Ko Rasiya,
                Ram Lakhan Sita Man Basiya.

                Sukshma Roop Dhari Siyahi Dikhava,
                Bikat Roop Dhari Lank Jarava.
                Bhim Roop Dhari Asur Sanhare,
                Ramachandra Ke Kaj Sanvare.

                Laye Sanjivan Lakhan Jiyaye,
                Shri Raghubir Harashi Ur Laye.
                Raghupati Kinhi Bahut Badai,
                Tum Mama Priya Bharat-Hi Sam Bhai.

                Sahas Badan Tumharo Jas Gavai,
                Asa Kahi Shripati Kanth Lagavai.
                Sankadik Brahmadi Munisa,
                Narad Sarad Sahit Ahisa.

                Jam Kuber Digpal Jahan Te,
                Kabi Kobid Kahi Sake Kahan Te.
                Tum Upkar Sugrivahin Kinha,
                Ram Milaye Rajpad Dinha.

                Tumharo Mantra Vibhishan Mana,
                Lankeshwar Bhaye Sab Jag Jana.
                Jug Sahasra Jojan Par Bhanu,
                Lilyo Tahi Madhur Phal Janu.

                Prabhu Mudrika Meli Mukh Mahi,
                Jaladhi Langhi Gaye Achraj Nahi.
                Durgam Kaj Jagat Ke Jete,
                Sugam Anugraha Tumhare Tete.

                Ram Duare Tum Rakhware,
                Hot Na Agya Binu Paisare.
                Sab Sukh Lahai Tumhari Sarna,
                Tum Rakshak Kahu Ko Darna.

                Aapan Tej Samharo Aapai,
                Teenon Lok Hank Te Kanpai.
                Bhoot Pishach Nikat Nahi Aavai,
                Mahabir Jab Nam Sunavai.

                Nasai Rog Harai Sab Pira,
                Japat Nirantar Hanumat Bira.
                Sankat Te Hanuman Chhudavai,
                Man Kram Bachan Dhyan Jo Lavai.

                Sab Par Ram Tapasvee Raja,
                Tin Ke Kaj Sakal Tum Saja.
                Aur Manorath Jo Koi Lavai,
                Soi Amit Jivan Phal Pavai.

                Charon Jug Partap Tumhara,
                Hai Parsiddha Jagat Ujiyara.
                Sadhu Sant Ke Tum Rakhware,
                Asur Nikandan Ram Dulare.

                Ashta Siddhi Nau Nidhi Ke Data,
                As Bar Deen Janaki Mata.
                Ram Rasayan Tumhare Pasa,
                Sada Raho Raghupati Ke Dasa.

                Tumhare Bhajan Ram Ko Pavai,
                Janam Janam Ke Dukh Bisravai.
                Antakal Raghuvar Pur Jai,
                Jahan Janma Hari-Bhakt Kahai.

                Aur Devta Chitt Na Dharai,
                Hanumat Sei Sarba Sukh Karai.
                Sankat Katai Mitai Sab Pira,
                Jo Sumirai Hanumat Balbira.

                Jai Jai Jai Hanuman Gosain,
                Kripa Karahu Gurudev Ki Nain.
                Jo Sat Bar Path Kar Koi,
                Chhutahi Bandi Maha Sukh Hoi.

                Jo Yah Padhe Hanuman Chalisa,
                Hoye Siddhi Sakhi Gaurisa.
                Tulsidas Sada Hari Chera,
                Kijai Nath Hriday Mahn Dera.

                Doha:
                Pavan Tanay Sankat Haran, Mangal Murati Roop,
                Ram Lakhan Sita Sahit, Hriday Basahu Sur Bhoop.
            """.trimIndent(),
            lyricsHindi = """
                दोहा:
                श्रीगुरु चरन सरोज रज, निज मनु मुकुरु सुधारि।
                बरनऊं रघुबर बिमल जसु, जो दायकु फल चारि॥
                बुद्धिहीन तनु जानिके, सुमिरौं पवन-कुमार।
                बल बुद्धि बिद्या देहु मोहिं, हरहु कलेस बिकार॥

                चौपाई:
                जय हनुमान ज्ञान गुन सागर।
                जय कपीस तिहुं लोक उजागर॥
                राम दूत अतुलित बल धामा।
                अंजनि-पुत्र पवनसुत नामा॥

                महाबीर बिक्रम बजरंगी।
                कुमति निवार सुमति के संगी॥
                कंचन बरन बिराज सुबेसा।
                कानन कुंडल कुंचित केसा॥

                हाथ बज्र औ ध्वजा बिराजै।
                कांधे मूंज जनेऊ साजै॥
                संकर सुवन केसरीनंदन।
                तेज प्रताप महा जग बंदन॥

                बिद्यावान गुनी अति चातुर।
                राम काज करिबे को आतुर॥
                प्रभु चरित्र सुनिबे को रसिया।
                राम लखन सीता मन बसिया॥

                सूक्ष्म रूप धरि सियहिं दिखावा।
                बिकट रूप धरि लंक जरावा॥
                भीम रूप धरि असुर संहारे।
                रामचंद्र के काज संवारे॥

                लाय सजीवन लखन जियाये।
                श्रीरघुबीर हरषि उर लाये॥
                रघुपति कीन्ही बहुत बड़ाई।
                तुम मम प्रिय भरतहि सम भाई॥

                सहस बदन तुम्हरो जस गावैं।
                अस कहि श्रीपति कंठ लगावैं॥
                सनकादिक ब्रह्मादि मुनीसा।
                नारद सारद सहित अहीसा॥

                जम कुबेर दिगपाल जहां ते।
                कबि कोबिद कहि सके कहां ते॥
                तुम उपकार सुग्रीवहिं कीन्हा।
                राम मिलाय राज पद दीन्हा॥

                तुम्हरो मंत्र बिभीषन माना।
                लंकेस्वर भए सब जग जाना॥
                जुग सहस्र जोजन पर भानू।
                लील्यो ताहि मधुर फल जानू॥

                प्रभु मुद्रिका मेलि मुख माहीं।
                जलधि लांघि गये अचरज नाहीं॥
                दुर्गम काज जगत के जेते।
                सुगम अनुग्रह तुम्हरे तेते॥

                राम दुआरे तुम रखवारे।
                होत न आज्ञा बिनु पैसारे॥
                सब सुख लहै तुम्हारी सरना।
                तुम रक्षक काहू को डरना॥

                आपन तेज सम्हारो आपै।
                तीनों लोक हांक तें कांपै॥
                भूत पिसाच निकट नहिं आवै।
                महाबीर जब नाम सुनावै॥

                नासै रोग हरै सब पीरा।
                जपत निरंतर हनुमत बीरा॥
                संकट तें हनुमान छुड़ावै।
                मन क्रम बचन ध्यान जो लावै॥

                सब पर राम तपस्वी राजा।
                तिन के काज सकल तुम साजा॥
                और मनोरथ जो कोई लावै।
                सोइ अमित जीवन फल पावै॥

                चारों जुग परताप तुम्हारा।
                है परसिद्ध जगत उजियारा॥
                साधु संत के तुम रखवारे।
                असुर निकंदन राम दुलारे॥

                अष्ट सिद्धि नौ निधि के दाता।
                अस बर दीन जानकी माता॥
                राम रसायन तुम्हरे पासा।
                सदा रहो रघुपति के दासा॥

                तुम्हरे भजन राम को पावै।
                जनम जनम के दुख बिसरावै॥
                अंत काल रघुबर पुर जाई।
                जहां जन्म हरि-भक्त कहाई॥

                और देवता चित्त न धरई।
                हनुमत सेइ सर्ब सुख करई॥
                संकट कटै मिटै सब पीरा।
                जो सुमिरै हनुमत बलबीरा॥

                जै जै जै हनुमान गोसाईं।
                कृपा करहु गुरुदेव की नाईं॥
                जो सत बार पाठ कर कोई।
                छूटहि बंदि महा सुख होई॥

                जो यह पढ़ै हनुमान चालीसा।
                होय सिद्धि साखी गौरीसा॥
                तुलसीदास सदा हरि चेरा।
                कीजै नाथ हृदय महं डेरा॥

                दोहा:
                पवन तनय संकट हरन, मंगल मूरति रूप।
                राम लखन सीता सहित, हृदय बसहु सुर भूप॥
            """.trimIndent()
        ),
        Bhajan(
            id = 2,
            title = "Achyutam Keshavam",
            titleHindi = "अच्युतम् केशवम्",
            deity = "Lord Krishna",
            youtubeVideoId = "B5c6v3otXq8",
            lyricsEnglish = """
                Achyutam Keshavam Krishna Damodaram,
                Rama Narayanam Janaki Vallabham.

                Kaun Kehta Hai Bhagvan Aate Nahi,
                Tum Meera Ke Jaise Bulate Nahi.
                Achyutam Keshavam Krishna Damodaram,
                Rama Narayanam Janaki Vallabham.

                Kaun Kehta Hai Bhagvan Khate Nahi,
                Ber Shabari Ke Jaise Khilate Nahi.
                Achyutam Keshavam Krishna Damodaram,
                Rama Narayanam Janaki Vallabham.

                Kaun Kehta Hai Bhagvan Sote Nahi,
                Maa Yashoda Ke Jaise Sulate Nahi.
                Achyutam Keshavam Krishna Damodaram,
                Rama Narayanam Janaki Vallabham.

                Kaun Kehta Hai Bhagvan Nachte Nahi,
                Gopiyon Ki Tarah Tum Nachate Nahi.
                Achyutam Keshavam Krishna Damodaram,
                Rama Narayanam Janaki Vallabham.

                Kaun Kehta Hai Bhagvan Rote Nahi,
                Draupadi Ke Jaise Pukarte Nahi.
                Achyutam Keshavam Krishna Damodaram,
                Rama Narayanam Janaki Vallabham.

                Naam Japte Chalo, Kaam Karte Chalo,
                Har Samay Krishna Ka Dhyan Karte Chalo.
                Yaad Aayegi Unko Kabhi Na Kabhi,
                Krishna Darshan To Denge Kabhi Na Kabhi.

                Achyutam Keshavam Krishna Damodaram,
                Rama Narayanam Janaki Vallabham.
            """.trimIndent(),
            lyricsHindi = """
                अच्युतम् केशवम् कृष्ण दामोदरम्,
                राम नारायणम् जानकी वल्लभम्॥

                कौन कहता है भगवान आते नहीं,
                तुम मीरा के जैसे बुलाते नहीं॥
                अच्युतम् केशवम् कृष्ण दामोदरम्,
                राम नारायणम् जानकी वल्लभम्॥

                कौन कहता है भगवान खाते नहीं,
                बेर शबरी के जैसे खिलाते नहीं॥
                अच्युतम् केशवम् कृष्ण दामोदरम्,
                राम नारायणम् जानकी वल्लभम्॥

                कौन कहता है भगवान सोते नहीं,
                माँ यशोदा के जैसे सुलाते नहीं॥
                अच्युतम् केशवम् कृष्ण दामोदरम्,
                राम नारायणम् जानकी वल्लभम्॥

                कौन कहता है भगवान नाचते नहीं,
                गोपियों की तरह तुम नचाते नहीं॥
                अच्युतम् केशवम् कृष्ण दामोदरम्,
                राम नारायणम् जानकी वल्लभम्॥

                कौन कहता है भगवान रोते नहीं,
                द्रौपदी के जैसे पुकारते नहीं॥
                अच्युतम् केशवम् कृष्ण दामोदरम्,
                राम नारायणम् जानकी वल्लभम्॥

                नाम जपते चलो, काम करते चलो,
                हर समय कृष्ण का ध्यान करते चलो।
                याद आएगी उनको कभी न कभी,
                कृष्ण दर्शन तो देंगे कभी न कभी॥

                अच्युतम् केशवम् कृष्ण दामोदरम्,
                राम नारायणम् जानकी वल्लभम्॥
            """.trimIndent()
        ),
        Bhajan(
            id = 3,
            title = "Shri Krishna Govind Hare Murari",
            titleHindi = "श्री कृष्ण गोविन्द हरे मुरारी",
            deity = "Lord Krishna",
            youtubeVideoId = "1qmPNot9NJs",
            lyricsEnglish = """
                Shri Krishna Govind Hare Murari,
                Hey Nath Narayan Vasudeva.

                Pitumat Swami Sakha Hamare,
                Hey Nath Narayan Vasudeva.
                Shri Krishna Govind Hare Murari,
                Hey Nath Narayan Vasudeva.

                Bandi Grihe Jin Ke Janam Lino,
                Vraj Mein Jakar Gokul Basa.
                Devaki Vasudev Ke Pran Pyare,
                Hey Nath Narayan Vasudeva.

                Mera Kanhaiya Hai Gokul Ka Gwala,
                Mathe Pe Mor Mukut Hai Nirala.
                Bansi Bajaye Sabke Man Ko Lubhaye,
                Hey Nath Narayan Vasudeva.

                Thakur Hamare Pran Se Pyare,
                Tum Ho Hamare Hum Hain Tumhare.
                Charanon Mein Tere Hamara Sahara,
                Hey Nath Narayan Vasudeva.

                Radhe Krishna Radhe Krishna,
                Krishna Krishna Radhe Radhe.
                Shri Krishna Govind Hare Murari,
                Hey Nath Narayan Vasudeva.
            """.trimIndent(),
            lyricsHindi = """
                श्री कृष्ण गोविन्द हरे मुरारी,
                हे नाथ नारायण वासुदेवा॥

                पितुमात स्वामी सखा हमारे,
                हे नाथ नारायण वासुदेवा॥
                श्री कृष्ण गोविन्द हरे मुरारी,
                हे नाथ नारायण वासुदेवा॥

                बंदीगृह में जिनके जन्म लीनो,
                व्रज में जाकर गोकुल बसो।
                देवकी वासुदेव के प्राण प्यारे,
                हे नाथ नारायण वासुदेवा॥

                मेरा कन्हैया है गोकुल का ग्वाला,
                माथे पे मोर मुकुट है निराला।
                बंसी बजाये सबके मन को लुभाये,
                हे नाथ नारायण वासुदेवा॥

                ठाकुर हमारे प्राण से प्यारे,
                तुम हो हमारे हम हैं तुम्हारे।
                चरणों में तेरे हमारा सहारा,
                हे नाथ नारायण वासुदेवा॥

                राधे कृष्ण राधे कृष्ण,
                कृष्ण कृष्ण राधे राधे।
                श्री कृष्ण गोविन्द हरे मुरारी,
                हे नाथ नारायण वासुदेवा॥
            """.trimIndent()
        ),
        Bhajan(
            id = 4,
            title = "Om Jai Jagdish Hare",
            titleHindi = "ॐ जय जगदीश हरे",
            deity = "Lord Vishnu",
            youtubeVideoId = "3ucCEjXS9n8",
            lyricsEnglish = """
                Om Jai Jagdish Hare, Swami Jai Jagdish Hare,
                Bhakt Jano Ke Sankat, Das Jano Ke Sankat,
                Kshan Mein Door Kare, Om Jai Jagdish Hare.

                Jo Dhyave Phal Pave, Dukh Binse Man Ka,
                Swami Dukh Binse Man Ka.
                Sukh Sampati Ghar Aave, Kasht Mite Tan Ka,
                Om Jai Jagdish Hare.

                Mat Pita Tum Mere, Sharan Gahun Kiski,
                Swami Sharan Gahun Kiski.
                Tum Bin Aur Na Dooja, Aas Karun Jiski,
                Om Jai Jagdish Hare.

                Tum Puran Parmatma, Tum Antaryami,
                Swami Tum Antaryami.
                Parbrahma Parmeshwar, Tum Sabke Swami,
                Om Jai Jagdish Hare.

                Tum Karuna Ke Sagar, Tum Palankarta,
                Swami Tum Palankarta.
                Main Moorakh Khal Kami, Main Sevak Tum Swami,
                Kripa Karo Bharta, Om Jai Jagdish Hare.

                Tum Ho Ek Agochar, Sabke Pranpati,
                Swami Sabke Pranpati.
                Kis Vidhi Milun Dayamay, Tumko Main Kumati,
                Om Jai Jagdish Hare.

                Dinbandhu Dukh Harta, Thakur Tum Mere,
                Swami Thakur Tum Mere.
                Apne Hath Uthao, Apni Sharan Lagao,
                Dwar Pada Tere, Om Jai Jagdish Hare.

                Vishay Vikar Mitao, Paap Haro Deva,
                Swami Paap Haro Deva.
                Shraddha Bhakti Badhao, Santan Ki Seva,
                Om Jai Jagdish Hare.

                Tan Man Dhan Sab Kuch Hai Tera, Swami Sab Kuch Hai Tera,
                Tera Tujhko Arpan, Kya Lage Mera,
                Om Jai Jagdish Hare.
            """.trimIndent(),
            lyricsHindi = """
                ॐ जय जगदीश हरे, स्वामी जय जगदीश हरे।
                भक्त जनों के संकट, दास जनों के संकट,
                क्षण में दूर करे, ॐ जय जगदीश हरे॥

                जो ध्यावे फल पावे, दुख बिनसे मन का,
                स्वामी दुख बिनसे मन का।
                सुख संपति घर आवे, कष्ट मिटे तन का,
                ॐ जय जगदीश हरे॥

                मात पिता तुम मेरे, शरण गहूँ किसकी,
                स्वामी शरण गहूँ किसकी।
                तुम बिन और न दूजा, आस करूँ जिसकी,
                ॐ जय जगदीश हरे॥

                तुम पूरण परमात्मा, तुम अंतर्यामी,
                स्वामी तुम अंतर्यामी।
                पारब्रह्म परमेश्वर, तुम सबके स्वामी,
                ॐ जय जगदीश हरे॥

                तुम करुणा के सागर, तुम पालनकर्ता,
                स्वामी तुम पालनकर्ता।
                मैं मूरख खल कामी, मैं सेवक तुम स्वामी,
                कृपा करो भर्ता, ॐ जय जगदीश हरे॥

                तुम हो एक अगोचर, सबके प्राणपति,
                स्वामी सबके प्राणपति।
                किस विधि मिलूँ दयामय, तुमको मैं कुमति,
                ॐ जय जगदीश हरे॥

                दीनबंधु दुखहर्ता, ठाकुर तुम मेरे,
                स्वामी ठाकुर तुम मेरे।
                अपने हाथ उठाओ, अपनी शरण लगाओ,
                द्वार पड़ा तेरे, ॐ जय जगदीश हरे॥

                विषय विकार मिटाओ, पाप हरो देवा,
                स्वामी पाप हरो देवा।
                श्रद्धा भक्ति बढ़ाओ, संतन की सेवा,
                ॐ जय जगदीश हरे॥

                तन मन धन सब कुछ है तेरा, स्वामी सब कुछ है तेरा,
                तेरा तुझको अर्पण, क्या लागे मेरा,
                ॐ जय जगदीश हरे॥
            """.trimIndent()
        ),
        Bhajan(
            id = 5,
            title = "Gayatri Mantra",
            titleHindi = "गायत्री मंत्र",
            deity = "Goddess Gayatri / Surya",
            youtubeVideoId = "nwRoHC83wx0",
            lyricsEnglish = """
                Om Bhur Bhuvaḥ Swaḥ,
                Tat-Savitur Vareṇyaṃ,
                Bhargo Devasya Dhīmahi,
                Dhiyo Yo Naḥ Prachodayāt.

                Om Bhur Bhuvaḥ Swaḥ,
                Tat-Savitur Vareṇyaṃ,
                Bhargo Devasya Dhīmahi,
                Dhiyo Yo Naḥ Prachodayāt.

                Gayatri Dhyana:
                Om Muktavidruma Hema Nila Dhavalach Chhayair Mukhais Trikshanaih,
                Yuktam Indu Nibaddha Ratna Mukutam Tattvartha Varnatmikam.
                Gayatrim Varadabhayankusha Kashah Shubhram Kapalam Gadam,
                Shankham Chakram Atharavinda Yugalam Hastair Vahantim Bhaje.

                Meaning:
                We meditate upon the supreme, effulgent, and sacred radiance of the Divine Creator (Savitur),
                who illuminates the physical, astral, and celestial realms.
                May that eternal divine light awaken, purify, and guide our intellect toward righteousness and wisdom.

                Om Shanti, Shanti, Shantiḥ.
            """.trimIndent(),
            lyricsHindi = """
                ॐ भूर्भुवः स्वः,
                तत्सवितुर्वरेण्यं,
                भर्गो देवस्य धीमहि,
                धियो यो नः प्रचोदयात्॥

                ॐ भूर्भुवः स्वः,
                तत्सवितुर्वरेण्यं,
                भर्गो देवस्य धीमहि,
                धियो यो नः प्रचोदयात्॥

                गायत्री ध्यानम्:
                ॐ मुक्ताविद्रुम हेमनीलधवलच्छायैर्मुखैस्त्रीक्षणैः,
                युक्तामिन्दुनिबद्धरत्नमुकुटां तत्त्वार्थवर्णात्मिकाम्।
                गायत्रीं वरदाभयांकुशकशः शुभ्रं कपालं गदां,
                शंखं चक्रमथारविन्दयुगलं हस्तैर्वहन्तीं भजे॥

                भावार्थ:
                हम उस प्राणस्वरूप, दुःखनाशक, सुखस्वरूप, श्रेष्ठ, तेजस्वी,
                पापनाशक, देवस्वरूप परमात्मा का ध्यान करते हैं।
                वह परमात्मा हमारी बुद्धि को सन्मार्ग की ओर प्रेरित करें।

                ॐ शान्तिः शान्तिः शान्तिः॥
            """.trimIndent()
        ),
        Bhajan(
            id = 6,
            title = "Shiv Tandav Stotram",
            titleHindi = "शिव तांडव स्तोत्रम्",
            deity = "Lord Shiva",
            youtubeVideoId = "S980-z1qx3g",
            lyricsEnglish = """
                Jatatavigalajjala Pravahapavitasthale,
                Galeavalambya Lambitam Bhujangatungamalikam,
                Damad Damad Damaddama Ninadavadamarvayam,
                Chakara Chandtandavam Tanotu Nah Shivah Shivam.

                Jatakatah Sambhrama Bhramannilimpanirjhari,
                Vilolavichivallari Virajamanamurdhani,
                Dhagaddhagaddhagajjvala Lalatapattapavake,
                Kishora Chandrashekhare Ratih Pratikshanam Mama.

                Dharadharendranandini Vilasabandhubandhura,
                Sphuradigantasantati Pramodamanamanase,
                Kripakatakshadhorani Niruddhadurdharapadi,
                Kvachiddigambare Mano Vinodametu Vastuni.

                Jatabhujangapingala Sphuratphanamaniprabha,
                Kadambakunkumadrava Praliptadigvadhumukhe,
                Madandhasindhurasphura Tvaguttariyamedure,
                Mano Vinodamadbhutam Bibhartu Bhutabhartari.

                Sahasralochanaprabhritya Sheshalekhashekhara,
                Prasunadhulidhorani Vidhusaranghripithabhuh,
                Bhujangarajamaliya Nibaddhajatajutakah,
                Shriyai Chiraya Jayatam Chakorabandhushekharah.

                Lalatachatvarajvala Dhananjayasphulingabha,
                Nipitapanchasayakam Namannilimpanayakam,
                Sudhamayukhalekhaya Virajamanashekharam,
                Mahakapalisampade Shiro Jatalamastu Nah.

                Karalabhalapattika Dhagaddhagaddhagajjvala,
                Dhananjayahutikrita Prachandapanchasayake,
                Dharadharendranandini Kuchagrachitrapatraka,
                Prakalpanaikashilpini Trilochane Ratirmama.

                Navinameghamandali Niruddhadurdharasphurat,
                Kuhu-nishithinitamah Prabandhabaddhakandharah,
                Nilimpanirjharidhara Tanotu Krittisindhurah,
                Kalanidhanabandhurah Shriyam Jagaddhurandharah.

                Praphullanilapankaja Prapanchakalimaprabha,
                Valambikanthakandali Ruchiprabaddhakandharam,
                Smarachchhidam Purachchhidam Bhavachchhidam Makhachchhidam,
                Gajachchhidandhakachchhidam Tamantakachchhidam Bhaje.

                Akharvasarvamangala Kalakadambamanjari,
                Rasapravahamadhuri Vijrimbhanamadhuvratam,
                Smarantakam Purantakam Bhavantakam Makhantakam,
                Gajantakandhakantakam Tamantakantakam Bhaje.

                Jayatvadabhravibhrama Bhramadbhujangamashvasa,
                Dvinirgamatkramasphurat Karalabalalhavyavat,
                Dhimiddhimiddhimidhvanan Mridangatungamangala,
                Dhvanikramapravartita Prachandatandavah Shivah.

                Drishadvichitratalpayor Bhujangamauktikasrajor,
                Garishtharatnaloshthayoh Suhridvipakshapakshayoh,
                Trinaravindachakshushoh Prajamahimahendrayoh,
                Samapravrittikah Kada Sadashivam Bhajamyaham.

                Kada Nilimpanirjhari Nikunjakotare Vasan,
                Vimuktadurmatih Sada Shirasthamanjalim Vahan,
                Vimuktalolalochano Lalamabhalalagnakah,
                Shiveti Mantramuchcharan Sada Sukhi Bhavamyaham.

                Idam Hi Nityamevamukta Muttamottamam Stavam,
                Pathan Smaran Bruvannaro Vishuddhimeti Santatam,
                Hare Gurau Subhaktimashu Yati Nanyatha Gatim,
                Vimohanam Hi Dehinam Sushankarasya Chintanam.

                Pujavasanasamaye Dashavaktragitam,
                Yah Shambhupujanaparam Pathati Pradoshe,
                Tasya Sthiram Rathagajendraturangayuktam,
                Lakshmim Sadaiva Sumukhim Pradadati Shambhuh.
            """.trimIndent(),
            lyricsHindi = """
                जटाटवीगलज्जल प्रवाहपावितस्थले,
                गलेऽवलम्ब्य लम्बितां भुजंगतुंगमालिकाम्।
                डमड्डमड्डमड्डमन्निनादवड्डमर्वयं,
                चकार चंडतांडवं तनोतु नः शिवः शिवम्॥ १॥

                जटाकटाहसंभ्रमभ्रमन्निलिंपनिर्झरी,
                विलोलवीचिवल्लरी विराजमानमूर्धनि।
                धगद्धगद्धगज्ज्वलल्ललाटपट्टपावके,
                किशोरचंद्रशेखरे रतिः प्रतिक्षणं मम॥ २॥

                धराधरेंद्रनंदिनी विलासबंधुबंधुर,
                स्फुरद्दिगंतसंतति प्रमोदमानमानसे।
                कृपाकटाक्षधोरणी निरुद्धदुर्धरापदि,
                क्वचिद्दिगंबरे मनो विनोदमेतु वस्तुनि॥ ३॥

                जटाभुजंगपिंगल स्फुरत्फणामणिप्रभा,
                कदंबकुंकुमद्रव प्रलिप्तदिग्वधूमुखे।
                मदांधसिंधुरस्फुरत्त्वगुत्तरीयमेदुरे,
                मनो विनोदमद्भुतं बिभर्तु भूतभर्तरि॥ ४॥

                सहस्रलोचनप्रभृत्य शेषलेखशेखर,
                प्रसूनधूलिधोरणी विधूसरांघ्रिपीठभूः।
                भुजंगराजमालया निबद्धजाटजूटकः,
                श्रियै चिराय जायतां चकोरबंधुशेखरः॥ ५॥

                ललाटचत्वरज्वलद्धनंजयस्फुलिंगभा,
                निपीतपंचसायकं नमन्निलिंपनायकम्।
                सुधामयूखलेखया विराजमानशेखरं,
                महाकपालिसंपदे शिरो जटालमस्तु नः॥ ६॥

                करालभालपट्टिका धगद्धगद्धगज्ज्वला,
                धनंजयाहुतीकृत प्रचंडपंचसायके।
                धराधरेंद्रनंदिनी कुचाग्रचित्रपत्रक,
                प्रकल्पनैकशिल्पिनि त्रिलोचने रतिर्मम॥ ७॥

                नवीनमेघमंडली निरुद्धदुर्धरस्फुरत्,
                कुहूनिशीथिनीतमः प्रबंधबद्धकंधरः।
                निलिंपनिर्झरीधरस्तनोतु कृत्तिसिंधुरः,
                कलानिधानबंधुरः श्रियं जगद्धुरंधरः॥ ८॥

                प्रफुल्लनीलपंकज प्रपंचकालिमप्रभा,
                वलंबिकंठकंदली रुचिप्रबद्धकंधरम्।
                स्मरच्छिदं पुरच्छिदं भवच्छिदं मखच्छिदं,
                गजच्छिदांधकच्छिदं तमंतकच्छिदं भजे॥ ९॥

                अखर्वसर्वमंगला कलाकदंबमंजरी,
                रसप्रवाहमाधुरी विजृंभणामधुव्रतम्।
                स्मरांतकं पुरान्तकं भवांतकं मखांतकं,
                गजांतकांधकांतकं तमंतकांतकं भजे॥ १०॥

                जयत्वदभ्रविभ्रम भ्रमद्भुजंगमश्वस,
                द्विनिर्गमत्क्रमस्फुरत् करालभालहव्यवाट्।
                धिमिद्धिमिद्धिमिध्वनन्मृदंगतुंगमंगल,
                ध्वनिक्रमप्रवर्तित प्रचंडतांडवः शिवः॥ ११॥

                दृषद्विचित्रतल्पयोर्भुजंगमौक्तिकस्रजोर्,
                गरिष्ठरत्नलोष्ठयोः सुहृद्विपक्षपक्षयोः।
                तृणारविंदचक्षुषोः प्रजामहीमहेन्द्रयोः,
                समप्रवृत्तिकः कदा सदाशिवं भजाम्यहम्॥ १२॥

                कदा निलिंपनिर्झरीनिकुंजकोटरे वसन्,
                विमुक्तदुर्मतिः सदा शिरःस्थमंजलिं वहन्।
                विमुक्तलोललोचनो ललामभाललग्नकः,
                शिवेति मंत्रमुच्चरन् सदा सुखी भवाम्यहम्॥ १३॥

                इदं हि नित्यमेवमुक्तमुत्तमोत्तमं स्तवं,
                पठन्स्मरन्ब्रुवन्नरो विशुद्धिमेति संततम्।
                हरे गुरौ सुभक्तिमाशु याति नान्यथा गतिं,
                विमोहनं हि देहिनां सुशंकरस्य चिंतनम्॥ १४॥

                पूजावसानसमये दशवक्त्रगीतं,
                यः शंभुपूजनपरं पठति प्रदोषे।
                तस्य स्थिरां रथगजेंद्रतुरंगयुक्तां,
                लक्ष्मीं सदैव सुमुखीं प्रददाति शंभुः॥ १५॥
            """.trimIndent()
        ),
        Bhajan(
            id = 7,
            title = "Payoji Maine Ram Ratan Dhan Payo",
            titleHindi = "पायो जी मैंने राम रतन धन पायो",
            deity = "Lord Rama",
            youtubeVideoId = "gBdHvMNfMfc",
            lyricsEnglish = """
                Payoji Maine Ram Ratan Dhan Payo,
                Vastu Amolik Di Mere Satguru,
                Kirpa Kar Apnayo, Payoji Maine Ram Ratan Dhan Payo.

                Janam Janam Ki Punji Pai,
                Jag Mein Sabhi Khovayo.
                Payoji Maine Ram Ratan Dhan Payo.

                Kharchai Na Koi Chor Na Lootai,
                Din Din Badhat Savayo.
                Payoji Maine Ram Ratan Dhan Payo.

                Sat Ki Nav Khevatiya Satguru,
                Bhav Sagar Tar Aayo.
                Payoji Maine Ram Ratan Dhan Payo.

                Meera Ke Prabhu Giridhar Nagar,
                Harakh Harakh Jas Gayo.
                Payoji Maine Ram Ratan Dhan Payo.
            """.trimIndent(),
            lyricsHindi = """
                पायो जी मैंने राम रतन धन पायो।
                वस्तु अमोलिक दी मेरे सतगुरु,
                कृपा कर अपनायो, पायो जी मैंने राम रतन धन पायो॥

                जनम जनम की पूंजी पाई,
                जग में सभी खोवायो।
                पायो जी मैंने राम रतन धन पायो॥

                खरचे न खूटे, चोर न लूटे,
                दिन दिन बढ़त सवायो।
                पायो जी मैंने राम रतन धन पायो॥

                सत की नाव खेवटिया सतगुरु,
                भवसागर तर आयो।
                पायो जी मैंने राम रतन धन पायो॥

                मीरा के प्रभु गिरिधर नागर,
                हरख हरख जस गायो।
                पायो जी मैंने राम रतन धन पायो॥
            """.trimIndent()
        ),
        Bhajan(
            id = 8,
            title = "Vaishnav Jan To",
            titleHindi = "वैष्णव जन तो",
            deity = "Lord Vishnu",
            youtubeVideoId = "5-OTLlB-DxE",
            lyricsEnglish = """
                Vaishnav Jan To Tene Kahiye Je,
                Peed Parayi Jaane Re.
                Par Dukkhe Upkar Kare Toye,
                Man Abhiman Na Aane Re.

                Sakal Lok Ma Sahune Vande,
                Ninda Na Kare Keni Re.
                Vaach Kaach Man Nishchal Rakhe,
                Dhan Dhan Janani Teni Re.

                Sam-Drishti Ne Trishna Tyagi,
                Par-Stree Jene Maat Re.
                Jivha Thaki Asatya Na Bole,
                Par-Dhan Nav Jhaale Haath Re.

                Moh Maya Vyape Nahi Jene,
                Dridh Vairagya Jena Man Ma Re.
                Ram Naam Shu Taali Re Laagi,
                Sakal Teerath Tena Tan Ma Re.

                Van-Lobhi Ne Kapat-Rahit Chhe,
                Kaam Krodh Nivaarya Re.
                Bhane Narsaiyo Tenu Darshan Karta,
                Kul Ekoter Taarya Re.
            """.trimIndent(),
            lyricsHindi = """
                वैष्णव जन तो तेने कहिये जे,
                पीड परायी जाणे रे।
                पर दुःखे उपकार करे तोये,
                मन अभिमान न आणे रे॥

                सकल लोक मां सहुने वंदे,
                निंदा न करे केनी रे।
                वाच काछ मन निश्चल राखे,
                धन धन जननी तेनी रे॥

                समदृष्टि ने तृष्णा त्यागी,
                परस्त्री जेने मात रे।
                जिह्वा थकी असत्य न बोले,
                परधन नव झाले हाथ रे॥

                मोह माया व्यापे नहि जेने,
                दृढ़ वैराग्य जेना मन मां रे।
                राम नाम शुं ताली रे लागी,
                सकल तीरथ तेना तन मां रे॥

                वणलोभी ने कपटरहित छे,
                काम क्रोध निवार्या रे।
                भणे नरसैयो तेनुं दर्शन करतां,
                कुल एकोतेर तार्या रे॥
            """.trimIndent()
        ),
        Bhajan(
            id = 9,
            title = "Raghupati Raghav Raja Ram",
            titleHindi = "रघुपति राघव राजा राम",
            deity = "Lord Rama",
            youtubeVideoId = "t25mW0FNFiY",
            lyricsEnglish = """
                Raghupati Raghav Raja Ram,
                Patita Pavan Sita Ram.

                Sita Ram, Sita Ram,
                Bhaj Pyare Tu Sita Ram.
                Raghupati Raghav Raja Ram,
                Patita Pavan Sita Ram.

                Ishwar Allah Tero Naam,
                Sabko Sanmati De Bhagwan.
                Raghupati Raghav Raja Ram,
                Patita Pavan Sita Ram.

                Ram Rahim Ko Bhajne Wale,
                Tere Pujan Ko Sab Aaye.
                Sabko Sanmati De Bhagwan,
                Sabko Sanmati De Bhagwan.

                Kaushalya Ke Dashrath Nandan,
                Janak Dulari Sita Vandan.
                Jai Jai Ram, Jai Sita Ram,
                Patita Pavan Sita Ram.

                Raghupati Raghav Raja Ram,
                Patita Pavan Sita Ram.
            """.trimIndent(),
            lyricsHindi = """
                रघुपति राघव राजा राम,
                पतित पावन सीता राम॥

                सीता राम, सीता राम,
                भज प्यारे तू सीता राम।
                रघुपति राघव राजा राम,
                पतित पावन सीता राम॥

                ईश्वर अल्ला तेरो नाम,
                सबको सन्मति दे भगवान।
                रघुपति राघव राजा राम,
                पतित पावन सीता राम॥

                राम रहीम को भजने वाले,
                तेरे पूजन को सब आये।
                सबको सन्मति दे भगवान,
                सबको सन्मति दे भगवान॥

                कौशल्या के दशरथ नंदन,
                जनक दुलारी सीता वंदन।
                जय जय राम, जय सीता राम,
                पतित पावन सीता राम॥

                रघुपति राघव राजा राम,
                पतित पावन सीता राम॥
            """.trimIndent()
        ),
        Bhajan(
            id = 10,
            title = "Sukhkarta Dukhaharta",
            titleHindi = "सुखकर्ता दुखहर्ता",
            deity = "Lord Ganesha",
            youtubeVideoId = "h85xdHRX5T4",
            lyricsEnglish = """
                Sukhkarta Dukhaharta Varta Vighnachi,
                Nurvi Purvi Prem Krupa Jayachi.
                Sarvangi Sundar Uti Shendurachi,
                Kanthi Jhalke Mal Muktafalanchi.

                Jai Dev Jai Dev Jai Mangal Murti,
                Darshan Matre Man Kamana Purti.
                Jai Dev Jai Dev.

                Ratnakhachit Fara Tujh Gaurikumra,
                Chandanaachi Uti Kumkum Keshara.
                Hirejadit Mukut Shobhato Bara,
                Runjhunati Nupure Charani Ghagariya.

                Jai Dev Jai Dev Jai Mangal Murti,
                Darshan Matre Man Kamana Purti.
                Jai Dev Jai Dev.

                Lambodar Pitambar Phanivar Bandhana,
                Saral Sond Vakratunda Trinayana.
                Das Ramacha Vat Pahe Sadana,
                Sankati Pavave Nirvani Rakshave Survar Vandana.

                Jai Dev Jai Dev Jai Mangal Murti,
                Darshan Matre Man Kamana Purti.
                Jai Dev Jai Dev.
            """.trimIndent(),
            lyricsHindi = """
                सुखकर्ता दुखहर्ता वार्ता विघ्नाची,
                नुरवी पुरवी प्रेम कृपा जयाची।
                सर्वांगी सुंदर उटी शेंदुराची,
                कंठी झळके माळ मुक्ताफळांची॥

                जय देव जय देव जय मंगलमूर्ती,
                दर्शनमात्रे मनकामना पूर्ती।
                जय देव जय देव॥

                रत्नखचित फरा तुज गौरीकुमरा,
                चंदनाची उटी कुंकुमकेशरा।
                हिरेजडित मुकुट शोभतो बरा,
                रुणझुणती नूपुरे चरणी घागरिया॥

                जय देव जय देव जय मंगलमूर्ती,
                दर्शनमात्रे मनकामना पूर्ती।
                जय देव जय देव॥

                लंबोदर पीतांबर फणिवर बंधना,
                सरळ सोंड वक्रतुंड त्रिनयना।
                दास रामाचा वाट पाहे सदना,
                संकटी पावावे निर्वाणी रक्षावे सुरवर वंदना॥

                जय देव जय देव जय मंगलमूर्ती,
                दर्शनमात्रे मनकामना पूर्ती।
                जय देव जय देव॥
            """.trimIndent()
        )
    )
}
