
package kanbagıs;

/**
 *
 * @author damla
 */
public class StateYonetim {
        private StateUI state;

     public StateYonetim()
     {
       state = new RandevularDoktor();
     }

     public void randevuIslemleri()
     {
      state.randevuIslemleri();
     } 

    
     public void durumDegisimi(StateUI newAccountState)
     {
      state = newAccountState;
     }
}
