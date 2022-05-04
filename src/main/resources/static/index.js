var array = [ ];

function kjopBillett() {
    const film = document.getElementById("film").value
    const antall = document.getElementById("antall").value;
    const fornavn = document.getElementById("fornavn").value;
    const etternavn = document.getElementById("etternavn").value;
    const telefonnr = document.getElementById("telefonnr").value;
    const epost = document.getElementById("epost").value;

    if(fornavn == "" || etternavn == "" || telefonnr == "" || epost == "" ){
        document.getElementById("feilAntall").innerHTML="Må skrive noe inn i antallet";
        document.getElementById("feilFornavn").innerHTML=" Må skrive noe inn i fornavnet ";
        document.getElementById("feilEtternavn").innerHTML=" Må skrive noe inn i etternavnet ";
        document.getElementById("feilTelefonnr").innerHTML=" Må skrive noe inn i telefonnr ";
        document.getElementById("feilEpost").innerHTML=" Må skrive noe inn i epost ";
    }
    else{
    array.push(antall + ' billetter til: ' + film + ' Navn er: '   + fornavn + ' ' + etternavn + 'telefonnr er : ' + telefonnr + 'og epost er :' + epost);
        document.getElementById("Billett").innerHTML= array;
        document.getElementById("antall").innerHTML="";
        document.getElementById("fornavn").innerHTML="";
        document.getElementById("etternavn").innerHTML="";
        document.getElementById("telefonnr").innerHTML="";
        document.getElementById("epost").innerHTML="";
    }
 }

 function slettAlle(){
      document.getElementById("Billett").innerHTML="";
      array = [];
 }

