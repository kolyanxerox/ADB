package androidx.arch.core.executor;

import androidx.webkit.WebStorageCompat;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Executor {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f15183OooOo0O;

    public /* synthetic */ OooO00o(int i) {
        this.f15183OooOo0O = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15183OooOo0O) {
            case 0:
                ArchTaskExecutor.lambda$static$0(runnable);
                break;
            case 1:
                ArchTaskExecutor.lambda$static$1(runnable);
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                WebStorageCompat.lambda$deleteBrowsingDataForSite$1(runnable);
                break;
            case 4:
                WebStorageCompat.lambda$deleteBrowsingData$0(runnable);
                break;
            default:
                AppLovinSdkUtils.runOnUiThread(runnable);
                break;
        }
    }
}
