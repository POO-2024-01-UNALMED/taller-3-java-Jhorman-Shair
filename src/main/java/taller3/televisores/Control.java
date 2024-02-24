package taller3.televisores;

public class Control {
	TV tv;
	  
	  public void turnOn(){
	    if (tv.estado!=true){
	     tv.estado=true; 
	    }
	  }
	  
	  public void turnOff(){
	    if (tv.estado!=false){
	      tv.estado=false;
	    }
	  }
	  
	  public void canalUp(){
	    if (tv.estado==true){
	     if (tv.canal!=120){
	      tv.canal+=1;
	    } 
	    }
	  }
	  
	  public void canalDown(){
	    if (tv.estado==true){
	     if (tv.canal!=1){
	      tv.canal-=1;
	    } 
	    }
	  }
	  
	  public void volumenUp(){
	    if (tv.estado==true){
	     if (tv.volumen!=7){
	      tv.volumen+=1;
	    } 
	    }
	  }
	  
	  public void volumenDown(){
	    if (tv.estado==true){
	     if (tv.volumen!=0){
	      tv.volumen-=1;
	    } 
	    }
	  }
	  
	  public void enlazar(TV u){
	    tv=u;
	    tv.control=this;
	  }
	  
	  public TV getTv(){
	    return tv;
	    
	  }
	  
	  public void setTv(TV d){
	    tv=d;
	    
	  }
	  
	  public void setVolumen(int a){
		    tv.setVolumen(a);
	  }
	  
	  public void setCanal(int x){
		    tv.setCanal(x);
		  }
	  
}
