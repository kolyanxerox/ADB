package OooOo0o;

import com.applovin.impl.AbstractC1078k7;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.ironsource.C2984bt;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import org.apache.tika.parser.AbstractExternalProcessParser;
import org.apache.tika.utils.ProcessUtils;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13606OooOo0O;

    public /* synthetic */ OooO(int i) {
        this.f13606OooOo0O = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13606OooOo0O) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.f15872OooO00o;
                break;
            case 1:
                AbstractC1078k7.m1227c();
                break;
            case 2:
                C2984bt.m8021f();
                break;
            case 3:
                FlutterFirebaseCrashlyticsPlugin.lambda$crash$1();
                break;
            case 4:
                AbstractExternalProcessParser.lambda$static$0();
                break;
            default:
                ProcessUtils.lambda$static$0();
                break;
        }
    }
}
