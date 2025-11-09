package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class li0 implements Oooo00O.OooO0OO, Oooo00O.OooO0o {

    /* renamed from: OooOo */
    public boolean f20892OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f20893OooOo0O;

    /* renamed from: OooOo0o */
    public boolean f20894OooOo0o;

    /* renamed from: OooOoO */
    public final Object f20895OooOoO;

    /* renamed from: OooOoO0 */
    public final Object f20896OooOoO0;

    /* renamed from: OooOoOO */
    public final Object f20897OooOoOO;

    public li0(Context context, Looper looper, ui0 ui0Var) {
        this.f20893OooOo0O = 0;
        this.f20897OooOoOO = new Object();
        this.f20894OooOo0o = false;
        this.f20892OooOo = false;
        this.f20895OooOoO = ui0Var;
        this.f20896OooOoO0 = new yi0(12800000, this, this, context, looper);
    }

    public void OooO00o() {
        synchronized (this.f20897OooOoOO) {
            try {
                if (((yi0) this.f20896OooOoO0).isConnected() || ((yi0) this.f20896OooOoO0).isConnecting()) {
                    ((yi0) this.f20896OooOoO0).disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Oooo00O.OooO0OO
    public void OooOO0(Bundle bundle) {
        synchronized (this.f20897OooOoOO) {
            try {
                if (this.f20892OooOo) {
                    return;
                }
                this.f20892OooOo = true;
                try {
                    bj0 bj0Var = (bj0) ((yi0) this.f20896OooOoO0).getService();
                    xi0 xi0Var = new xi0(1, ((ui0) this.f20895OooOoO).OooO0Oo());
                    Parcel parcelOooO = bj0Var.OooO();
                    AbstractC2218x2.OooO0OO(parcelOooO, xi0Var);
                    bj0Var.o000OO0O(parcelOooO, 2);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    OooO00o();
                    throw th;
                }
                OooO00o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Oooo00O.OooO0OO
    public void OooOOO(int i) {
    }

    public String toString() {
        switch (this.f20893OooOo0O) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f20894OooOo0o + ", prettyPrintIndent='" + ((String) this.f20896OooOoO0) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f20895OooOoO) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f20892OooOo + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((oo0O.OooO00o) this.f20897OooOoOO) + ')';
            default:
                return super.toString();
        }
    }

    public li0() {
        this.f20893OooOo0O = 1;
        oo0O.OooO00o oooO00o = oo0O.OooO00o.f33199OooOo0O;
        this.f20894OooOo0o = true;
        this.f20896OooOoO0 = "    ";
        this.f20895OooOoO = "type";
        this.f20892OooOo = true;
        this.f20897OooOoOO = oooO00o;
    }

    @Override // Oooo00O.OooO0o
    public void OooO(OooOooo.o000Oo0 o000oo02) {
    }
}
