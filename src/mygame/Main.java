package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;
import com.jme3.system.AppSettings;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    public static final Quaternion PITCH090 = new Quaternion().fromAngleAxis(FastMath.PI/2,new Vector3f(1,0,0));
    public Spatial ob;
    public Spatial op;
    public Spatial om;
    public Spatial ou;
    public Spatial on;
    public Spatial os;
    public Spatial tv;
    public Spatial tm;
    public Spatial tu;
    public Spatial tn;

    public static void main(String[] args) {
        AppSettings settings = new AppSettings(true);
        settings.setTitle("Tower Defence.NLue");
        settings.setSettingsDialogImage("interface/59fb7475b6cdb8d755b20154e1e9bee0.jpg");
        settings.setResolution(1280, 960);
        Main app = new Main();
        app.setSettings(settings);
        app.start();
    }

    @Override
    public void simpleInitApp() {
        cam.setLocation(new Vector3f(0,40,15));
        cam.setRotation(PITCH090);
        
        Node Nodo_Sol= new Node("Nodo_Sol");
        Node Nodo_Gvenus = new Node("Nodo_Gvenus");
        Node Nodo_Gmarte = new Node("Nodo_Gmarte");
        Node Nodo_Gurano = new Node("Nodo_Gurano");
        Node Nodo_Gneptuno = new Node("Nodo_Gneptuno");
        
        Node Nodo_Tierra= new Node("Nodo_Tierra");
        
        Node Nodo_Venus = new Node("Nodo_Venus");
        
        Node Nodo_Marte = new Node("Nodo_Marte");
        
        Node Nodo_Urano = new Node("Nodo_Urano");
        
        Node Nodo_Neptuno = new Node("Nodo_Neptuno");
        
        
        Sphere sol = new Sphere(50,50,6.0f);
        Geometry geo_sol = new Geometry("Sphere_sol",sol);
        
        Material mat_Sol = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //mat.setColor("Color", ColorRGBA.Blue);
        mat_Sol.setTexture("ColorMap", assetManager.loadTexture("Textures/sol.jpg"));
        geo_sol.setMaterial(mat_Sol);
        
        Sphere Tierra = new Sphere(100,100,2.0f);
        Geometry geo_Tierra = new Geometry("Sphere_tierra",Tierra);
        
        Material mat_Tierra = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //mate.setColor("Color", ColorRGBA.Red);
        mat_Tierra.setTexture("ColorMap", assetManager.loadTexture("Textures/planeta_tierra.jpg"));
        geo_Tierra.setMaterial(mat_Tierra);
        
        Sphere venus = new Sphere(100,100,2.0f);
        Geometry geo_Venus = new Geometry("Sphere_venus",venus);
        
        Material mat_venus = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat_venus.setTexture("ColorMap", assetManager.loadTexture("Textures/venus.jpg"));
        geo_Venus.setMaterial(mat_venus);
        
        Sphere marte = new Sphere(100,100,2.0f);
        Geometry geo_Marte = new Geometry("Sphere_marte",marte);
        
        Material mat_Marte = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat_Marte.setTexture("ColorMap", assetManager.loadTexture("Textures/marte.jpg"));
        geo_Marte.setMaterial(mat_Marte);
        
        Sphere urano = new Sphere(100,100,2.0f);
        Geometry geo_Urano = new Geometry("Sphere_urano",urano);
        
        Material mat_Urano = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat_Urano.setTexture("ColorMap", assetManager.loadTexture("Textures/urano.jpg"));
        geo_Urano.setMaterial(mat_Urano);
        
        Sphere neptuno = new Sphere(100,100,2.0f);
        Geometry geo_Neptuno = new Geometry("Sphere_venus",neptuno);
        
        Material mat_Neptuno = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat_Neptuno.setTexture("ColorMap", assetManager.loadTexture("Textures/neptuno.jpg"));
        geo_Neptuno.setMaterial(mat_Neptuno);
        
        Nodo_Sol.attachChild(geo_sol);
        Nodo_Tierra.attachChild(geo_Tierra);
        Nodo_Venus.attachChild(geo_Venus);
        Nodo_Marte.attachChild(geo_Marte);
        Nodo_Urano.attachChild(geo_Urano);
        Nodo_Neptuno.attachChild(geo_Neptuno);
        
        Nodo_Sol.move(12,0,0);
        Nodo_Tierra.move(-16,0,0);
        Nodo_Venus.move(-10,0,0);
        Nodo_Marte.move(-22,0,0);
        Nodo_Urano.move(-28,0,0);
        Nodo_Neptuno.move(-34,0,0);
        Nodo_Gvenus.move(12,0,0);
        Nodo_Gmarte.move(12,0,0);
        Nodo_Gurano.move(12,0,0);
        Nodo_Gneptuno.move(12,0,0);

        Nodo_Sol.attachChild(Nodo_Venus);
        Nodo_Gvenus.attachChild(Nodo_Tierra);
        Nodo_Gmarte.attachChild(Nodo_Marte);
        Nodo_Gurano.attachChild(Nodo_Urano);
        Nodo_Gneptuno.attachChild(Nodo_Neptuno);
        
        rootNode.attachChild(Nodo_Sol);
        rootNode.attachChild(Nodo_Gvenus);
        rootNode.attachChild(Nodo_Gmarte);
        rootNode.attachChild(Nodo_Gurano);
        rootNode.attachChild(Nodo_Gneptuno);

    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
        if(ob==null && op==null && om==null && ou==null && on==null && os==null && tv==null && tm==null && tu==null && tn==null){
            System.err.println("No esta asignado el objeto¡");
            ob = rootNode.getChild("Nodo_Tierra");
            
            System.err.println("No esta asignado el Objeto");
            op = rootNode.getChild("Nodo_Venus");
            
            System.err.println("No esta asignado el Objeto");
            om = rootNode.getChild("Nodo_Marte");
            
            System.err.println("No esta asignado el Objeto");
            ou = rootNode.getChild("Nodo_Urano");
            
            System.err.println("No esta asignado el Objeto");
            on = rootNode.getChild("Nodo_Neptuno");
            
            System.err.println("No esta asignado el objeto¡");
            os = rootNode.getChild("Nodo_Sol");
            
            System.err.println("No esta asignado el objeto¡");
            tv = rootNode.getChild("Nodo_Gvenus"); 
            
            System.err.println("No esta asignado el objeto¡");
            tm = rootNode.getChild("Nodo_Gmarte"); 
            
            System.err.println("No esta asignado el objeto¡");
            tu = rootNode.getChild("Nodo_Gurano"); 
            
            System.err.println("No esta asignado el objeto¡");
            tn = rootNode.getChild("Nodo_Gneptuno"); 
        }
        else
        {
            ob.rotate(0,0,tpf);
            op.rotate(0,0,tpf);
            om.rotate(0,0,tpf);
            ou.rotate(0,0,tpf);
            on.rotate(0,0,tpf);
            os.rotate(0,0,tpf);
            tv.rotate(0,0,tpf*0.76f);
            tm.rotate(0,0,tpf*0.66f);
            tu.rotate(0,0,tpf*0.45f);
            tn.rotate(0,0,tpf*0.2f);
        }
        System.out.print("velocidad del TPF="+tpf+" ");
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
