package com.digitalindia.digirail.DataUtils;

import android.content.Context;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.digitalindia.digirail.R;

import java.util.List;

/**
 * Created by root on 1/7/17.
 */

public class PassengerAdapter extends RecyclerView.Adapter<PassengerAdapter.CustomViewPassenger>{

    public int mCoach;
    public PassengerAdapter(int coachNumber){
        mCoach = coachNumber;
        Log.d("PassengerAdapter", "PassengerAdapter: "+coachNumber);
    }

    // To maintain the index and Coach Number adding a empty Array in start (Index 0)

    String[][] nameArray = new String[][] {
            {},
            {
                    "Shivani Mahurkar","Utkarsh Mast","Naman Deshpande","Kesar Mane","Kesar Sharma","Sudesh Gajul","Sudhir Gajul","Siddhart Teli","Apurv Kadam","Shivani Jagtap","Riya Sule","Kesariya Sule","Akshay Lokhande","Kesariya Selvam","Amit Chiravallai","Indrajeet Kumar","Dolly Dighe","Kesar Lalitha","Sunny Kale","Visham Gore","Naman Verma","Sanket Sule","Jack Gandhi","Komal Mehta","Sudhir Dighe","Sudhir Sharma","Sudesh Chiravallai","Komal Gandhi","Piyush Agarwal","Jack Mehta","Shreyas Bond","Piyush Khan","Vedant Rokhde","Pooja Jain","Sudesh Sarda","Aakash Sule","Sanket Narayan","Ram Jagtap","Vishwajeet Raj","Komal Dighe","Vedant Gajul","Vedang Mahurkar","Naman Mast","Naman Gore","Jack Mast","Arshad Sharma","Ram Rokhde","Amit Teli","Alekha Nalawade","Amit Tadsarkar","Sid Raj","Vishwajeet Sharma","Visham Kale","Naman Dighe","Kesar Selvam","Alekha Dighe","Alekha Chiravallai","Vedant Gore","Shivam Deshpande","Sunny Teli"},
            {
                    "Bharath Jain","Piyush Lokhande","Amit Rokhde","Shivani Rokhde","Sudesh Sharma","Arpit Gandhi","Arshad Jagtap","Abhishek Agarwal","Siddhart Leone","Vedant Kokate","Piyush Khan","Naman Todkar","Piyush Sarda","Naman Kale","Piyush Narayan","Aditya Raj","Siddhart Rokhde","Alekha Kokate","Shivani Gushi","Sudhir Verma","Naman Mast","Sid Mahurkar","Arpit Sharma","Amit Khandare","Aakash Bond","Akshay Agarwal","Riya Todkar","Smriti Dighe","Alekha Gandhi","Ijju Selvam","Piyush Mahurkar","Sunny Sarda","Shreyas Sule","Sid Dongre","Naman Narayan","Smriti Nalawade","Atharva Agarwal","Sanket Bond","Shashank Agarwal","Rohith Mane","Aakash Sarda","Ijju Sarda","Alekha Mahurkar","Satyajeet Teli","Aarti Kadam","Naman Dighe","Vedang Sule","Alekha Bond","Arpit Raj","Dolly Kumar","Aakash Rokhde","Jack Mane","Rohith Lalitha","Shivani Narayan","Gunny Narayan","Utkarsh Raj","Omkar Sarda","Alekha Lokhande","Aditya Bond","Rohith Gajul"},
            {
                    "Sid Teli","Sudesh Khan","Aditya Gushi","Sudesh Chiravallai","Aditya Agarwal","Smriti Kokate","Dolly Kale","Atharva Lalitha","Arshad Dighe","Aditya Deshpande","Utkarsh Lokhande","Shashank Rada","Dolly Mast","Shivani Lalitha","Arshad Kumar","Aarti Kadam","Kesar Todkar","Aditya Nalawade","Aakash Selvam","Alekha Teli","Shivani Sule","Shivam Tadsarkar","Naman Mast","Kalindra Deshpande","Alekha Raj","Piyush Bond","Visham Kokate","Komal Rada","Naman Khan","Siddhart Khandare","Ijju Sarda","Vedang Dighe","Sudhir Gandhi","Piyush Narayan","Shreyas Kumar","Ijju Kale","Aditya Mehta","Smriti Kokate","Sudesh Jain","Vishwajeet Bond","Vishwajeet Lokhande","Aditya Kadam","Ijju Chiravallai","Omkar Kale","Rohith Gajul","Omkar Lalitha","Satyajeet Gajul","Atharva Verma","Utkarsh Todkar","Vedang Khan","Riya Selvam","Gunny Sarda","Piyush Leone","Ram Nalawade","Sanket Mehta","Bharath Chiravallai","Aakash Selvam","Indrajeet Mehta","Alekha Mehta","Piyush Dighe"},
            {
                    "Sudhir Selvam","Aarti Mast","Pooja Gandhi","Amit Dongre","Sanket Narayan","Sudesh Tadsarkar","Ijju Deshpande","Alekha Leone","Indrajeet Mahurkar","Ijju Lalitha","Arshad Dongre","Ram Teli","Arpit Rada","Arshad Mehta","Sunny Raj","Atharva Selvam","Arpit Kokate","Riya Dighe","Rohith Gore","Vedant Mast","Apurv Leone","Aarti Rokhde","Vishwajeet Gajul","Akshay Leone","Komal Gandhi","Akshay Dongre","Amit Khan","Ijju Jagtap","Apurv Nalawade","Omkar Selvam","Satyajeet Mehta","Vedang Jain","Omkar Agarwal","Shivani Narayan","Kalindra Leone","Gunny Chiravallai","Sudhir Kale","Piyush Narayan","Shivam Gajul","Aarti Mahurkar","Bharath Rokhde","Kesar Gushi","Kalindra Selvam","Aarti Dongre","Amit Lalitha","Ram Raj","Kalindra Mehta","Aarti Khan","Komal Kadam","Sid Todkar","Utkarsh Rada","Kesar Tadsarkar","Kesariya Lokhande","Alekha Agarwal","Satyajeet Todkar","Sunny Kale","Arshad Rokhde","Circuit Mast","Apurv Sule","Aditya Kumar"},
            {
                    "Abhishek Gushi","Atharva Bond","Shashank Jagtap","Circuit Gushi","Alekha Raj","Aakash Khandare","Gunny Gushi","Shivani Khan","Shivani Rokhde","Atharva Chiravallai","Arshad Teli","Akshay Todkar","Kesar Sule","Kesariya Raj","Atharva Raj","Aarti Todkar","Aakash Mahurkar","Omkar Gajul","Vishwajeet Dongre","Sudesh Sarda","Shreyas Lokhande","Ijju Rada","Visham Nalawade","Gunny Todkar","Vishwajeet Mehta","Ijju Rada","Aditya Khandare","Sudesh Dongre","Rohith Nalawade","Indrajeet Rokhde","Dolly Kokate","Kalindra Mehta","Aarti Mast","Satyajeet Khan","Abhishek Deshpande","Shashank Dighe","Shivam Verma","Abhishek Khan","Sunny Narayan","Circuit Rokhde","Circuit Rada","Jack Dongre","Sid Kadam","Circuit Lalitha","Dolly Nalawade","Atharva Mehta","Akshay Mast","Atharva Dighe","Piyush Tadsarkar","Kesar Bond","Sudhir Teli","Aakash Nalawade","Sudhir Kale","Dolly Sarda","Jack Gajul","Arshad Mehta","Shivam Gandhi","Shivani Rada","Vedang Jain","Gunny Jagtap"},
            {
                    "Arshad Khan","Sudhir Chiravallai","Omkar Sharma","Aditya Gandhi","Shivam Chiravallai","Riya Deshpande","Shashank Gandhi","Aditya Mahurkar","Satyajeet Dongre","Shivam Khandare","Shashank Khandare","Aarti Khan","Arshad Rada","Shreyas Lokhande","Gunny Leone","Shashank Kale","Atharva Kokate","Aakash Mane","Visham Rokhde","Arshad Gajul","Aarti Mane","Gunny Sarda","Indrajeet Sharma","Circuit Sule","Shivam Sarda","Kesariya Sule","Akshay Leone","Sudhir Chiravallai","Amit Kumar","Omkar Jain","Satyajeet Jagtap","Sudhir Rokhde","Sanket Dongre","Sid Kadam","Shivani Selvam","Sudesh Chiravallai","Sid Lokhande","Jack Mane","Dolly Mast","Rohith Mast","Amit Kadam","Akshay Dongre","Riya Raj","Ijju Kadam","Vedang Agarwal","Riya Dighe","Pooja Todkar","Circuit Tadsarkar","Akshay Kadam","Indrajeet Mahurkar","Arpit Lalitha","Ijju Chiravallai","Aditya Gajul","Smriti Lokhande","Vedant Gore","Alekha Deshpande","Kesariya Narayan","Vishwajeet Mahurkar","Naman Gore","Sudesh Mehta"},
            {
                    "Kalindra Rada","Sunny Mane","Indrajeet Gore","Naman Deshpande","Naman Gajul","Sudhir Selvam","Alekha Narayan","Aakash Gajul","Aarti Narayan","Gunny Kadam","Arpit Lokhande","Abhishek Gore","Naman Kale","Indrajeet Teli","Smriti Gore","Satyajeet Lalitha","Rohith Kale","Rohith Agarwal","Shreyas Verma","Komal Lalitha","Kalindra Tadsarkar","Vedant Dongre","Sid Lokhande","Aditya Dighe","Sunny Mast","Jack Leone","Arpit Narayan","Gunny Kadam","Aakash Deshpande","Abhishek Kadam","Sanket Rokhde","Satyajeet Khandare","Pooja Gushi","Amit Narayan","Akshay Dighe","Jack Mast","Visham Leone","Kesariya Kadam","Sudesh Chiravallai","Sunny Mehta","Sanket Lalitha","Kalindra Gore","Pooja Dongre","Sunny Verma","Aarti Narayan","Rohith Kadam","Shivani Bond","Shreyas Narayan","Pooja Dongre","Riya Lalitha","Gunny Todkar","Sudesh Kumar","Ram Chiravallai","Sudhir Narayan","Alekha Dongre","Ijju Selvam","Vedang Mehta","Shivani Selvam","Shashank Mahurkar","Shreyas Nalawade"},
            {
                    "Shashank Selvam","Sudhir Chiravallai","Sunny Nalawade","Arpit Mahurkar","Circuit Selvam","Siddhart Kokate","Utkarsh Khan","Circuit Gore","Aakash Nalawade","Omkar Gandhi","Akshay Selvam","Vedant Kadam","Ijju Dongre","Aakash Rada","Aditya Chiravallai","Vedant Bond","Satyajeet Gore","Akshay Tadsarkar","Satyajeet Kumar","Riya Lokhande","Kesariya Narayan","Satyajeet Lalitha","Jack Lokhande","Rohith Mahurkar","Shivam Gandhi","Arshad Mane","Siddhart Mehta","Omkar Deshpande","Sudhir Kokate","Apurv Sharma","Kesariya Jain","Aakash Gore","Pooja Kale","Arpit Narayan","Abhishek Gandhi","Aarti Narayan","Omkar Chiravallai","Vedant Kokate","Arpit Jagtap","Apurv Todkar","Apurv Kale","Utkarsh Mast","Dolly Rada","Arpit Nalawade","Sudesh Mane","Ijju Gushi","Akshay Mast","Sudhir Kokate","Sanket Gandhi","Apurv Gore","Sudhir Chiravallai","Apurv Mane","Kesariya Gandhi","Bharath Jagtap","Kalindra Gajul","Komal Dongre","Jack Gandhi","Shivam Mast","Aarti Gore","Aarti Kokate"},
            {
                    "Shashank Mahurkar","Apurv Khan","Amit Deshpande","Arshad Kokate","Shashank Rokhde","Atharva Bond","Vishwajeet Narayan","Bharath Leone","Vedang Teli","Jack Gandhi","Vishwajeet Lalitha","Vedang Narayan","Komal Dongre","Sudesh Khan","Omkar Gore","Omkar Todkar","Omkar Rokhde","Gunny Dighe","Aditya Gandhi","Smriti Gore","Shreyas Jagtap","Omkar Sarda","Riya Rokhde","Aditya Kumar","Jack Khandare","Shashank Mane","Alekha Jain","Shivam Tadsarkar","Akshay Sharma","Dolly Mast","Komal Teli","Kalindra Sule","Piyush Sarda","Aakash Gushi","Komal Nalawade","Vedant Kumar","Alekha Khandare","Utkarsh Bond","Kesar Kale","Shivam Gushi","Sunny Chiravallai","Rohith Kumar","Naman Dighe","Indrajeet Agarwal","Kesariya Agarwal","Dolly Gushi","Atharva Dongre","Siddhart Lokhande","Sunny Lokhande","Shivam Raj","Smriti Agarwal","Vishwajeet Rokhde","Abhishek Jagtap","Atharva Teli","Apurv Sarda","Vedant Jagtap","Komal Mahurkar","Kesariya Kadam","Arshad Kokate","Shreyas Narayan"}
    };

    // To maintain the index and Coach Number adding a empty Array in start (Index 0)

    String[][] pnrArray = new String[][]{
            {},
            {
                    "777043000989","328384412740","127641288531","732597940786","367405804212","843294962987","501776910457","272898217820","958029784914","154896205272","134065147082","584042982473","544689619088","710933225475","131563823473","347377376110","881501441426","667934076839","440920233462","728636255885","755418126093","199308125540","370618539609","847872151169","827265758610","571158436669","365379916913","421915999826","765083788109","787143526226","643619670272","102067620317","894519270051","280304419583","400309861736","522920675004","719804149128","919883679906","739019466571","946331787307","911039769547","186343538211","344108338348","915331267919","570807563076","622358488405","515376571258","369742043339","613537643113","944785684823","564340019999","509798749328","650958420019","439865027998","508621818986","671387115948","725990590221","629262788523","888514452074","481617841141"},
            {
                    "121481485198","162980831246","826428095960","732536996059","251136916608","172013691605","695004607711","308122238773","264604759748","165366466111","999148491225","639086923103","873006136984","676060388292","395843893161","744155126854","994785544354","861478879356","942579581313","427230667410","572537294192","570158748011","482620461767","771452831797","591442470672","364076358719","347851153598","955553419810","180563716034","721393233313","443157328400","502517373466","355945226813","526980378666","856882937657","787641934841","681270718874","992230387964","723296789270","897846550690","219433117819","911385222256","692463060720","419841491288","622246664957","636367534624","513300665852","283429691283","996180853465","785124530990","387887969158","110935580974","969708620755","865310202704","362888997762","407785721161","380611682056","695437854774","750444963105","525688807139"},
            {
                    "448121356665","161656783905","981503978014","142457423533","493223380582","801665929059","753191187530","476710005744","294451358447","623060639164","627146545118","222507023500","566667205237","276609319452","783452800632","359476084595","668431763596","922916686640","334452918909","623136730440","370408646959","320645311372","898709800774","551894339186","784625817763","199565013472","916291404442","225246509569","953388852535","800164297770","564049051796","718589007263","397118421961","168526722278","884648001149","728786607879","990182992577","630413343802","897502690516","925010912689","851388181384","841741428789","219570103317","423912187107","444681082601","242465666377","901985543775","958843446956","712138383735","119839830202","917905702726","540705262347","953420478212","793716230962","915331854320","638430645967","977815973606","902018043370","257217788315","315181447202"},
            {
                    "300091491682","522518443527","319926572480","376506984292","232542877792","133739334105","163448224992","121411551842","386408078784","742788615624","670126686820","424344528255","481844349136","598130280252","408280151391","451203825906","416509999086","390030388942","256825699886","666433958088","342302076288","727536353429","191753527075","960066362389","122983215907","983628228019","229841915821","993114292006","726100680213","366821526118","733034819021","552814683135","984726596788","964815177555","835326962501","114066019095","208396759689","407320385094","291315720802","742676705508","360354859196","917382031019","734001506386","464487867249","954313876074","547411465706","970941395479","760138841489","914745907027","214175184391","804093138324","693824356498","653573086108","100066941195","659448524558","122246879206","826261759514","443870765138","966422704867","390540733652"},
            {
                    "829251999228","180405696658","446020783778","929177682729","993034069442","415936566564","140589839408","628354628815","569327474796","381031620143","305225715257","996716557024","821432680121","945825101682","539990570495","929520651791","956915065648","723652286201","326037692889","798654489329","203230372610","884000585257","273220427475","853720550286","649620371170","909812637678","389235969767","562174349190","340703774987","917937562374","104356093626","822203718507","495339621787","544817511137","560931914052","747809469533","936392342553","164614267706","188294218013","639991917187","363109533816","695725543446","560175701529","437876163428","499113713804","982136439991","310010249564","578043775287","517351864057","412473217621","460423613022","434012698063","642185258883","617739899793","166193979649","521458218985","989966899912","238505608177","377327733568","470006631173"},
            {
                    "166790600971","133060786970","325574220892","522518635502","708319296240","393223235913","419310428958","148222680246","649985074162","276208158842","671410197581","505814375291","830298621848","676386263981","197014090551","358935498703","582199646851","121583064105","123328284845","731951253122","238763145135","755283658936","788086296599","281361827468","811939723114","118047299527","792210703346","614563349494","201950302859","689702635146","176816194463","837689750677","817517687159","344181014244","921871229349","656881256403","653383076276","629998420221","702116685834","264807400322","507680665355","567883625313","531105660148","160339525794","911728522889","102630738063","526334987623","285445054653","647575259374","143160599729","714711578489","839106190287","562880348487","661100703279","816645148929","623986409825","693637563380","398508582480","698055075846","635536910954"},
            {
                    "708662876456","318397989535","557497805453","204776715131","790099032432","302470575850","999720651593","996419546717","969433025869","612825085210","342562851930","286531207623","515551520293","646483766692","954637787240","756989461225","745610876247","120761808766","361761874644","404148022229","969346034018","661673219610","930419044431","925588357793","468917126095","605530576152","200630145193","765022892699","381365802918","431311049515","109358900051","965939225917","788970330077","794354709931","600911810085","942950024733","117329095884","773823631586","297013027257","556878949849","103149366673","951313046969","330329715926","336725067647","463084861042","984746173225","134914901730","868456918018","102339591099","266908979699","645746087205","207213414839","615951402373","447794702891","164745137107","411133934692","850106543644","351763433549","400436574904","334559188002"},
            {
                    "410256178818","785080267133","193136229164","301620034236","475992527963","128128137783","221839538794","269694741125","549040728584","686145181059","427674339115","214685379164","347828597047","115482821738","379329150286","736693873791","584604196077","339779989723","359156699501","362914667724","882940178080","481526955990","256693086935","457814890035","243584466109","155826704654","244676180330","191104517357","866727780483","888672185865","853746989609","866366360805","426152654020","988389964894","574401044863","645130214297","337057142119","335288256969","563556357511","579365317589","190168457086","622298992981","770809865465","215658316688","497650494007","924097526870","717453822061","384357347364","356420201846","979959563370","391673674878","579412277178","710548423269","445431050041","863068988404","818279502955","949948998616","446268290865","746593897677","745170301305"},
            {
                    "588952072219","648756135658","564823988198","811924008759","308940548528","100682691482","996829520113","214952606326","451088315213","159109785256","914047653683","554238600194","402618852846","492497906053","911667592120","671982686204","251097076943","818796659951","556867080635","660720165846","677932376700","930507048754","686597244726","609027163045","657185854301","408221284453","236244563480","311550866586","100279686546","370140387808","218192201799","138831089810","988128723509","156667318820","375207467268","868715289051","517272640678","235447365954","719192849062","586428717438","656999476970","638086211660","987658145797","132406203700","162269960553","718378027170","474366040488","177280217749","543317589884","436659344091","338222489404","747130281590","497843080277","733914440784","975178685465","253243696785","278348955031","123953590211","261778398988","933419077975"}
    };

    @Override
    public CustomViewPassenger onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layout_id = R.layout.passenger_info;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(layout_id,parent,false);
        return new CustomViewPassenger(view);
    }

    @Override
    public void onBindViewHolder(CustomViewPassenger holder, int position, List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public void onBindViewHolder(CustomViewPassenger holder, int position) {
        holder.bind(nameArray[mCoach+1][position],pnrArray[mCoach+1][position],"+91-1234567891");
    }

    @Override
    public int getItemCount() {
        return nameArray[mCoach+1].length;
    }

    public class CustomViewPassenger extends RecyclerView.ViewHolder{

        TextView mname;
        TextView mmobile;
        TextView mpnr;
        TextView mseat;
        View seatView;
        EditText otp_1;
        EditText otp_2;
        EditText otp_3;
        LinearLayout linearLayout;
        LinearLayout mainBody;

        public CustomViewPassenger(View view){
            super(view);
            mainBody = (LinearLayout)view.findViewById(R.id.main_container);
            linearLayout = (LinearLayout)view.findViewById(R.id.otp_section);
            otp_1 = (EditText)view.findViewById(R.id.otp_first_number);
            otp_2 = (EditText)view.findViewById(R.id.otp_second_number);
            otp_3 = (EditText)view.findViewById(R.id.otp_third_number);
            /*linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    requestFocus(otp_1);
                }
            });
            mainBody.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    requestFocus(otp_1);
                }
            });
            otp_1.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    requestFocus(otp_2);
                    return false;
                }
            });
            otp_2.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    requestFocus(otp_3);
                    return false;
                }
            });
            otp_3.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    // To verify the otp
                    return false;
                }
            });
            otp_1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    requestFocus(otp_2);
                    return false;
                }
            });
            otp_2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    requestFocus(otp_3);
                    return false;
                }
            });
            otp_3.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return false;
                }
            });*/
            mname = (TextView)view.findViewById(R.id.passenger_info_name);
            mmobile = (TextView)view.findViewById(R.id.passenger_info_mobile);
            mpnr = (TextView)view.findViewById(R.id.passenger_info_pnr);
            seatView = view.findViewById(R.id.seat_no);
            mseat = (TextView)seatView.findViewById(R.id.coach_name);

        }

        public final void requestFocus(View view){
            view.requestFocus();
        }

        public void bind(String name,String mobile,String pnr){
            mname.setText(name);
            mmobile.setText(mobile);
            mpnr.setText(pnr);
            mseat.setText(""+(1+getAdapterPosition()));
        }
    }
}
