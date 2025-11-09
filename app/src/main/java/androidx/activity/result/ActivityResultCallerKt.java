package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import o00O0Oo.Oooo000;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<OooOo> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i, ActivityResultRegistry activityResultRegistry, Oooo000 oooo000) {
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, activityResultRegistry, new OooO00o(0, oooo000)), activityResultContract, i);
    }

    public static final <I, O> ActivityResultLauncher<OooOo> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i, Oooo000 oooo000) {
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, new OooO00o(1, oooo000)), activityResultContract, i);
    }
}
