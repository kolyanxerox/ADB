package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l00 extends AbstractBinderC2181w2 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC1454cd {

    /* renamed from: OooOo */
    public C1917oy f20751OooOo;

    /* renamed from: OooOo0O */
    public View f20752OooOo0O;

    /* renamed from: OooOo0o */
    public zzeb f20753OooOo0o;

    /* renamed from: OooOoO */
    public boolean f20754OooOoO;

    /* renamed from: OooOoO0 */
    public boolean f20755OooOoO0;

    public final void o000O0O0(Oooo0o.OooO0O0 oooO0O0, InterfaceC1527ed interfaceC1527ed) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        if (this.f20755OooOoO0) {
            zzo.zzg("Instream ad can not be shown after destroy().");
            try {
                interfaceC1527ed.zze(2);
                return;
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
                return;
            }
        }
        View view = this.f20752OooOo0O;
        if (view == null || this.f20753OooOo0o == null) {
            zzo.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            try {
                interfaceC1527ed.zze(0);
                return;
            } catch (RemoteException e2) {
                zzo.zzl("#007 Could not call remote method.", e2);
                return;
            }
        }
        if (this.f20754OooOoO) {
            zzo.zzg("Instream ad should not be used again.");
            try {
                interfaceC1527ed.zze(1);
                return;
            } catch (RemoteException e3) {
                zzo.zzl("#007 Could not call remote method.", e3);
                return;
            }
        }
        this.f20754OooOoO = true;
        o000O0oO();
        ((ViewGroup) Oooo0o.OooO0OO.o000O0oO(oooO0O0)).addView(this.f20752OooOo0O, new ViewGroup.LayoutParams(-1, -1));
        zzv.zzy();
        ViewTreeObserverOnGlobalLayoutListenerC1500dm viewTreeObserverOnGlobalLayoutListenerC1500dm = new ViewTreeObserverOnGlobalLayoutListenerC1500dm(this.f20752OooOo0O, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC1500dm.f23178OooOo0O).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnGlobalLayoutListenerC1500dm.o00000oo(viewTreeObserver);
        }
        zzv.zzy();
        ViewTreeObserverOnScrollChangedListenerC1536em viewTreeObserverOnScrollChangedListenerC1536em = new ViewTreeObserverOnScrollChangedListenerC1536em(this.f20752OooOo0O, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC1536em.f23178OooOo0O).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnScrollChangedListenerC1536em.o00000oo(viewTreeObserver3);
        }
        o000O0o0();
        try {
            interfaceC1527ed.zzf();
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void o000O0o0() {
        View view;
        C1917oy c1917oy = this.f20751OooOo;
        if (c1917oy == null || (view = this.f20752OooOo0O) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        c1917oy.OooO0O0(view, map, map, C1917oy.OooO0oo(view));
    }

    public final void o000O0oO() {
        View view = this.f20752OooOo0O;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f20752OooOo0O);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        C1991qy c1991qy;
        zzeb zzebVar = null;
        interfaceC1634h9 = null;
        interfaceC1634h9 = null;
        InterfaceC1634h9 interfaceC1634h9 = null;
        InterfaceC1527ed c1491dd = null;
        if (i == 3) {
            Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
            if (this.f20755OooOoO0) {
                zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            } else {
                zzebVar = this.f20753OooOo0o;
            }
            parcel2.writeNoException();
            AbstractC2218x2.OooO0o0(parcel2, zzebVar);
        } else if (i == 4) {
            Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
            o000O0oO();
            C1917oy c1917oy = this.f20751OooOo;
            if (c1917oy != null) {
                c1917oy.OooOOOo();
            }
            this.f20751OooOo = null;
            this.f20752OooOo0O = null;
            this.f20753OooOo0o = null;
            this.f20755OooOoO0 = true;
            parcel2.writeNoException();
        } else if (i == 5) {
            Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                c1491dd = iInterfaceQueryLocalInterface instanceof InterfaceC1527ed ? (InterfaceC1527ed) iInterfaceQueryLocalInterface : new C1491dd(strongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            }
            AbstractC2218x2.OooO0O0(parcel);
            o000O0O0(oooO0O0O000O0o0, c1491dd);
            parcel2.writeNoException();
        } else if (i == 6) {
            Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
            AbstractC2218x2.OooO0O0(parcel);
            Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
            o000O0O0(oooO0O0O000O0o02, new k00("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
            if (this.f20755OooOoO0) {
                zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            } else {
                C1917oy c1917oy2 = this.f20751OooOo;
                if (c1917oy2 != null && (c1991qy = c1917oy2.f23155OooOoo) != null) {
                    synchronized (c1991qy) {
                        interfaceC1634h9 = c1991qy.f23708OooO00o;
                    }
                }
            }
            parcel2.writeNoException();
            AbstractC2218x2.OooO0o0(parcel2, interfaceC1634h9);
        }
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        o000O0o0();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        o000O0o0();
    }
}
