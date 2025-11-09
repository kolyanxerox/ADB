package io.flutter.plugins.firebase.firebaseremoteconfig;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements OnCompleteListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfigPlugin f28764OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28765OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f28766OooOo0o;

    public /* synthetic */ OooO0O0(Oooo000 oooo000, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, int i) {
        this.f28765OooOo0O = i;
        this.f28766OooOo0o = oooo000;
        this.f28764OooOo = firebaseRemoteConfigPlugin;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f28765OooOo0O) {
            case 0:
                FirebaseRemoteConfigPlugin.fetch$lambda$3(this.f28766OooOo0o, this.f28764OooOo, task);
                break;
            case 1:
                FirebaseRemoteConfigPlugin.setConfigSettings$lambda$6(this.f28766OooOo0o, this.f28764OooOo, task);
                break;
            case 2:
                FirebaseRemoteConfigPlugin.setCustomSignals$lambda$9(this.f28766OooOo0o, this.f28764OooOo, task);
                break;
            case 3:
                FirebaseRemoteConfigPlugin.fetchAndActivate$lambda$4(this.f28766OooOo0o, this.f28764OooOo, task);
                break;
            case 4:
                FirebaseRemoteConfigPlugin.ensureInitialized$lambda$8(this.f28766OooOo0o, this.f28764OooOo, task);
                break;
            case 5:
                FirebaseRemoteConfigPlugin.setDefaults$lambda$7(this.f28766OooOo0o, this.f28764OooOo, task);
                break;
            default:
                FirebaseRemoteConfigPlugin.activate$lambda$5(this.f28766OooOo0o, this.f28764OooOo, task);
                break;
        }
    }
}
