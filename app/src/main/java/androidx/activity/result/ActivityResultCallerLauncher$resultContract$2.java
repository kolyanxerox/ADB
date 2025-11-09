package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class ActivityResultCallerLauncher$resultContract$2 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

    /* renamed from: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1 */
    public static final class C00331<O> extends ActivityResultContract<OooOo, O> {
        final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

        public C00331(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
            activityResultCallerLauncher = activityResultCallerLauncher;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public O parseResult(int i, Intent intent) {
            return (O) activityResultCallerLauncher.getCallerContract().parseResult(i, intent);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, OooOo oooOo) {
            return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityResultCallerLauncher$resultContract$2(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
        super(0);
        this.this$0 = activityResultCallerLauncher;
    }

    @Override // o00O0Oo.OooO0O0
    public final C00331 invoke() {
        return new ActivityResultContract<OooOo, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
            final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

            public C00331(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
                activityResultCallerLauncher = activityResultCallerLauncher;
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            public O parseResult(int i, Intent intent) {
                return (O) activityResultCallerLauncher.getCallerContract().parseResult(i, intent);
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            public Intent createIntent(Context context, OooOo oooOo) {
                return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
            }
        };
    }
}
