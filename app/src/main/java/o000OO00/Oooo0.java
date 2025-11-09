package o000oo00;

import android.util.Log;

/* loaded from: classes2.dex */
public final class Oooo0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f31084OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31085OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f31086OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f31087OooOoO0;

    public /* synthetic */ Oooo0(String str, int i, int i2, boolean z) {
        this.f31085OooOo0O = i2;
        this.f31086OooOo0o = i;
        this.f31084OooOo = str;
        this.f31087OooOoO0 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31085OooOo0O) {
            case 0:
                StringBuilder sb = new StringBuilder("connect port: ");
                int i = this.f31086OooOo0o;
                sb.append(i);
                sb.append(", ip: ");
                String str = this.f31084OooOo;
                sb.append(str);
                sb.append(", isLocalHost: ");
                boolean z = this.f31087OooOoO0;
                sb.append(z);
                Log.i("mdns", sb.toString());
                o000oOoO.f31097OooO0O0.f31098OooO00o.invokeMethod("onJsonReceived", "{\"connectPort\":\"" + i + "\",\"ip\":\"" + str + "\",\"isLocalHost\":" + z + "}");
                break;
            default:
                StringBuilder sb2 = new StringBuilder("connect port: ");
                int i2 = this.f31086OooOo0o;
                sb2.append(i2);
                sb2.append(", ip: ");
                String str2 = this.f31084OooOo;
                sb2.append(str2);
                sb2.append(", isLocalHost: ");
                boolean z2 = this.f31087OooOoO0;
                sb2.append(z2);
                Log.i("mdns", sb2.toString());
                o000oOoO.f31097OooO0O0.f31098OooO00o.invokeMethod("onJsonReceived", "{\"connectPort\":\"" + i2 + "\",\"ip\":\"" + str2 + "\",\"isLocalHost\":" + z2 + "}");
                break;
        }
    }
}
