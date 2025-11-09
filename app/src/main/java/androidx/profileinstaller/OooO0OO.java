package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15319OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f15320OooOo0o;

    public /* synthetic */ OooO0OO(Context context, int i) {
        this.f15319OooOo0O = i;
        this.f15320OooOo0o = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        switch (this.f15319OooOo0O) {
            case 0:
                ProfileInstallerInitializer.writeInBackground(this.f15320OooOo0o);
                break;
            default:
                ProfileInstaller.writeProfile(this.f15320OooOo0o);
                break;
        }
    }
}
