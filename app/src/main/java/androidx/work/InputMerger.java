package androidx.work;

import OooO0oO.OooOo;
import java.util.List;

/* loaded from: classes.dex */
public abstract class InputMerger {
    private static final String TAG = Logger.tagWithPrefix("InputMerger");

    public static InputMerger fromClassName(String str) {
        try {
            return (InputMerger) Class.forName(str).newInstance();
        } catch (Exception e) {
            Logger.get().error(TAG, OooOo.OooOO0("Trouble instantiating + ", str), e);
            return null;
        }
    }

    public abstract Data merge(List<Data> list);
}
