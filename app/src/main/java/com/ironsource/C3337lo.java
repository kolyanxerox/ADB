package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* renamed from: com.ironsource.lo */
/* loaded from: classes2.dex */
public class C3337lo implements InterfaceC3522pf {

    /* renamed from: a */
    private String f9415a = "lo";

    /* renamed from: b */
    private int f9416b = 23;

    /* renamed from: c */
    private final InterfaceC3557qf f9417c;

    /* renamed from: d */
    private ConnectivityManager.NetworkCallback f9418d;

    /* renamed from: com.ironsource.lo$a */
    public class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        final /* synthetic */ Context f9419a;

        public a(Context context) {
            this.f9419a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C3337lo.this.f9417c.mo11555a(C2635a9.m4796a(network, this.f9419a), C2635a9.m4797a(this.f9419a, network));
                return;
            }
            InterfaceC3557qf interfaceC3557qf = C3337lo.this.f9417c;
            String strM4798b = C2635a9.m4798b(this.f9419a);
            Context context = this.f9419a;
            interfaceC3557qf.mo11555a(strM4798b, C2635a9.m4797a(context, C2635a9.m4793a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C3337lo.this.f9417c.mo11556b(C2635a9.m4796a(network, this.f9419a), C2635a9.m4797a(this.f9419a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C3337lo.this.f9417c.mo11556b(C2635a9.m4796a(network, this.f9419a), C2635a9.m4797a(this.f9419a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (C2635a9.m4798b(this.f9419a).equals("none")) {
                C3337lo.this.f9417c.mo11554a();
            }
        }
    }

    public C3337lo(InterfaceC3557qf interfaceC3557qf) {
        this.f9417c = interfaceC3557qf;
    }

    @Override // com.ironsource.InterfaceC3522pf
    @SuppressLint({"NewApi", "MissingPermission"})
    /* renamed from: b */
    public void mo9863b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f9416b) {
            mo9862a(context);
            if (C2635a9.m4798b(context).equals("none")) {
                this.f9417c.mo11554a();
            }
            if (this.f9418d == null) {
                this.f9418d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.f9418d);
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                Log.e(this.f9415a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC3522pf
    /* renamed from: c */
    public JSONObject mo9864c(Context context) {
        return C2635a9.m4797a(context, C2635a9.m4793a(context));
    }

    @Override // com.ironsource.InterfaceC3522pf
    /* renamed from: a */
    public void mo9861a() {
        this.f9418d = null;
    }

    @Override // com.ironsource.InterfaceC3522pf
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo9862a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f9416b || this.f9418d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f9418d);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            Log.e(this.f9415a, "NetworkCallback for was not registered or already unregistered");
        }
    }
}
