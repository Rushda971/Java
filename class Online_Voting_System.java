import java.util.*;
class Online_Voting_System {

//classes
Scanner sc = new Scanner(System.in);
HashSet<String> voters =new HashSet<String>();
ArrayList<String> candidate = new ArrayList<String> ();
int votes [];
 
//show candidates
public void showCandidate(){
   
    candidate.add("Modi");
    candidate.add("Rahul Gandhi");
    candidate.add("Kejriwal");
    candidate.add("Mamta Benergi");
    votes = new int[candidate.size()];

for (int i = 0 ; i<candidate.size();i++){
    System.out.println((i+1)+ "." + candidate.get(i));
}
}

//vote
public void vote(){
    System.out.println("Please Enter your Voter_id: ");
    String voterId =sc.nextLine();


if(voters.contains(voterId)){
    System.out.println("Already voted");
    return;
}

System.out.println("Enter Candidate to Vote: ");

int candidateId =sc.nextInt();
sc.nextLine();

if(candidateId >=1 && candidateId <=candidate.size()){
    votes[candidateId -1 ]++;
    voters.add(voterId);
}
}
//show result
public void showResult(){
    int maxVotes =0;
    String winner="";
    for(int counting = 0;counting<votes.length;counting++){
        if(votes[counting]>maxVotes){
            maxVotes=votes[counting];
            winner=candidate.get(counting);
        }
    }
System.out.println("Winner candidate"+winner);
System.out.println("Win by "+maxVotes);
}
//exit
    public static void main(String [] args){
        Online_Voting_System obj =new Online_Voting_System();
        int choice;
        do{
        System.out.println(
        "=======ONLINE VOTING SYSTEM====== \n"+
            "1. Show Candidate \n"+
            "2. Vote \n"+
            "3.Show Result \n"+
            "4.Exit");

            choice=obj.sc.nextInt();
            obj.sc.nextLine();
         switch(choice){
            case 1: obj.showCandidate(); break;
            case 2: obj.vote(); break;
            case 3: obj.showResult(); break;
            case 4: System.out.println("Exiting System"); break;
        }
    }
    

        while(choice !=4);
        obj.sc.close();
    }
    }