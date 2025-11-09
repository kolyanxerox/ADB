package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f15228OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15229OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f15230OooOo0o;

    public /* synthetic */ OooOOO0(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i) {
        this.f15229OooOo0O = i;
        this.f15230OooOo0o = locationListenerTransport;
        this.f15228OooOo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15229OooOo0O) {
            case 0:
                this.f15230OooOo0o.lambda$onProviderEnabled$4(this.f15228OooOo);
                break;
            default:
                this.f15230OooOo0o.lambda$onProviderDisabled$5(this.f15228OooOo);
                break;
        }
    }
}
