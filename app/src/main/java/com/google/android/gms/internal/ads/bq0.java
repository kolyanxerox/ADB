package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class bq0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f17582OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f17583OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public volatile Logger f17584OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Serializable f17585OooO0Oo;

    public bq0(Class cls, int i) {
        this.f17582OooO00o = i;
        switch (i) {
            case 1:
                this.f17585OooO0Oo = new com.google.android.gms.internal.play_billing.OooOo00();
                this.f17583OooO0O0 = cls.getName();
                break;
            default:
                this.f17585OooO0Oo = new ll0();
                this.f17583OooO0O0 = cls.getName();
                break;
        }
    }

    public final Logger OooO00o() {
        Logger logger;
        Logger logger2;
        switch (this.f17582OooO00o) {
            case 0:
                Logger logger3 = this.f17584OooO0OO;
                if (logger3 != null) {
                    return logger3;
                }
                synchronized (((ll0) this.f17585OooO0Oo)) {
                    try {
                        logger = this.f17584OooO0OO;
                        if (logger == null) {
                            logger = Logger.getLogger(this.f17583OooO0O0);
                            this.f17584OooO0OO = logger;
                        }
                    } finally {
                    }
                }
                return logger;
            default:
                Logger logger4 = this.f17584OooO0OO;
                if (logger4 != null) {
                    return logger4;
                }
                synchronized (((com.google.android.gms.internal.play_billing.OooOo00) this.f17585OooO0Oo)) {
                    try {
                        logger2 = this.f17584OooO0OO;
                        if (logger2 == null) {
                            logger2 = Logger.getLogger(this.f17583OooO0O0);
                            this.f17584OooO0OO = logger2;
                        }
                    } finally {
                    }
                }
                return logger2;
        }
    }
}
