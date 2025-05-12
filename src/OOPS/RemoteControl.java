package OOPS;

//Abstraction 

abstract public class RemoteControl {
	
	abstract void powerOn();
    abstract void changeChannel(int channel);
    
    	public static void main(String[] args) {
    		
    		 RemoteControl remote = new TVRemote();
    	        remote.powerOn();
    	        remote.changeChannel(5);
		

	}
    
}

class TVRemote extends RemoteControl {
	
    @Override
    void powerOn() {
        System.out.println("TV is ON");
    }

    @Override
    void changeChannel(int channel) {
        System.out.println("channel switching " + channel);
    }
}

	


