package androidx.core.os;

import android.p001os.OutcomeReceiver;
import o00O0O0O.OooO0OO;

/* loaded from: classes.dex */
public final class OutcomeReceiverKt {
    public static final <R, E extends Throwable> OutcomeReceiver asOutcomeReceiver(OooO0OO oooO0OO) {
        return OooOO0.OooO0O0.OooOOO0(new ContinuationOutcomeReceiver(oooO0OO));
    }
}
