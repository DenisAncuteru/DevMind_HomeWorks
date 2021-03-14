package Proiect2;

import java.util.Random;

public class FortuneCookie implements ISurprise {

    private static Random randomNumber = new Random();
    private static String[] quotes = {"„Mâine voi fi ceea ce am ales astăzi să fiu.\" — James Joyce",
            "„În faţa noastră sunt lucruri mai interesante decât cele pe care le-am lăsat în urmă.\" — C. S. Lewis",
            "„Tinereţea e fericită tocmai pentru că are în faţa ei viitorul.\" — Nikolai Gogol",
            "„Viitorul este suma paşilor pe care îi faci, inclusiv a celor mici, ignoraţi sau luaţi în râs.\" — Henri Coandă",
            "„Partea cea mai bună a viitorului este că vine în fiecare zi.\" — Abraham Lincoln",
            "„Astăzi e acel ”mâine” de care te temeai ieri.\" — Mark Twain",
            "„Viitorul începe acum, nu mâine.” — Papa Ioan-Paul-II",
            "„Plănuiește-ți cu grijă viitorul, pentru că acolo o să-ți petreci restul vieții.” — Mark Twain",
            "„Viitorul le aparține celor care cred în frumusețea visurilor lor.” — Eleanor Roosevelt",
            "„Să nu-ţi faci din viitor, doar un loc de reciclat trecut! -Octav Bibere„",
            "„Fiecare sfânt are un trecut și fiecare păcătos are un viitor. Oscar Wilde„",
            "„De trecut ne despărțim râzând, iar în viitor intrăm încruntați. Vasile Ghica „",
            "„Trecutul ne salvează de prezent construind un viitor robust. -Jose Ortega y Gasset„",
            "„Recunoştinţă pentru trecut şi speranţă pentru viitor ar trebui să avem întotdeauna. -Lubbock„",
            "„Fiecare ceas pierdut în tinereţe este o şansă de nefericire pentru viitor. -Napoleon Bonaparte„",
            "„Omul nu poate exista fără un punct fix în viitor. În condiţii obişnuite, întregul său prezent" +
                    " se modelează în jurul acelui punct din viitor spre care se îndreaptă," +
                    " aşa cum pilitura de fier se orientează spre polul unui magnet. -Viktor Frankl„",
            "„Nu putem lăsa trecutul fără sicriu, dar nici viitorul fără leagăn. Vasile Ghica„",
            "„Ce naiv e omul: distruge prezentul făcându-şi griji pentru viitor şi plânge în viitor amintindu-şi " +
                    "de trecut. -Ali Ibn Abi Talib „",
            "„Să fii pozitiv este ca şi cum ţi-ai împacheta un cadou, pe care îl vei primi în viitor. -Nicoleta Popliceanu„",
            "„Imaginaţia noastră este singura limită a ceea ce putem spera sa realizăm în viitor. -Charles F. Kettering„",
            "„Viitorul începe acum, nu mâine. Papa Ioan-Paul-II„",
            "„Cel mai bun mijloc de a prezice viitorul este să-l creezi tu singur. Stephen Covey„"};

    public String getCitat() {
        return citat;
    }

    private String citat;


    public FortuneCookie(String citat){
        this.citat = citat;

    }
    public static FortuneCookie generate() {

        String citat = quotes[randomNumber.nextInt(22)];
        FortuneCookie fortuneCookie = new FortuneCookie(citat);

        return fortuneCookie;
    }

    @Override
    public void enjoy(){
        System.out.println(getCitat());
    }

    @Override
    public String toString(){
        return citat;
    }
}
