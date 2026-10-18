
public class Alcancia
{
    private int monedas50;
    private int monedas100;
    private int monedas200;
    private int monedas500;
    private int monedas1000;
    
    public Alcancia(){
    this.monedas50=0;
    this.monedas100=0;
    this.monedas200=0;
    this.monedas500=0;
    this.monedas1000=0;
    }
    
    public boolean agregarMonedas(int valor){
        
        switch(valor)
        {
            case 50:
                this.monedas50++;
                break;
            case 100:
                this.monedas100++;
                break;
            case 200:
                this.monedas200++;
                break;
            case 500:
                this.monedas500++;
                break;
            case 1000:
                this.monedas1000++;
                break;      
        }
        return true;
    }
    
    public int getSaldo(){
    return (this.monedas50*50)+
            (this.monedas100*100)+
            (this.monedas200*200)+
            (this.monedas500*500)+
            (this.monedas1000*1000);
    }
    
    public int getTotalMonedas(){
    return this.monedas50+this.monedas100+this.monedas200+this.monedas500+this.monedas1000;
    }
    
    public int getMonedas50(){
    return this.monedas50;
    }
    
    public int getMonedas100(){
    return this.monedas100;
    }
    
    public int getMonedas200(){
    return this.monedas200;
    }
    
    public int getMonedas500(){
    return this.monedas500;
    }
    
    public int getMonedas1000(){
    return this.monedas1000;
    }
    
    public void vaciar(){
        this.monedas50=0;
        this.monedas100=0;
        this.monedas200=0;
        this.monedas500=0;
        this.monedas1000=0;
    }
}