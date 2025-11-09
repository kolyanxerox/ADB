package androidx.transition;

import OooO0oO.OooOo;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class TransitionValues {
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbOooOo = OooOo.OooOo("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbOooOo.append(this.view);
        sbOooOo.append("\n");
        String strOooOoo0 = OooOo.OooOoo0(sbOooOo.toString(), "    values:");
        for (String str : this.values.keySet()) {
            strOooOoo0 = strOooOoo0 + "    " + str + ": " + this.values.get(str) + "\n";
        }
        return strOooOoo0;
    }

    public TransitionValues(View view) {
        this.view = view;
    }
}
