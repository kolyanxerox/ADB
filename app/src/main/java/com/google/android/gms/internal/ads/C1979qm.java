package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.qm */
/* loaded from: classes2.dex */
public final class C1979qm extends qj0 {

    /* renamed from: OooOo */
    public final Display f23643OooOo;

    /* renamed from: OooOo0O */
    public final SensorManager f23644OooOo0O;

    /* renamed from: OooOoOO */
    public float[] f23648OooOoOO;

    /* renamed from: OooOoo */
    public C2016rm f23649OooOoo;

    /* renamed from: OooOoo0 */
    public pj0 f23650OooOoo0;

    /* renamed from: OooOoO0 */
    public final float[] f23647OooOoO0 = new float[9];

    /* renamed from: OooOoO */
    public final float[] f23646OooOoO = new float[9];

    /* renamed from: OooOo0o */
    public final Object f23645OooOo0o = new Object();

    public C1979qm(Context context) {
        this.f23644OooOo0O = (SensorManager) context.getSystemService("sensor");
        this.f23643OooOo = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void OooO00o(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f23645OooOo0o) {
            try {
                if (this.f23648OooOoOO == null) {
                    this.f23648OooOoOO = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f23647OooOoO0, fArr);
        int rotation = this.f23643OooOo.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f23647OooOoO0, 2, 129, this.f23646OooOoO);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f23647OooOoO0, 129, 130, this.f23646OooOoO);
        } else if (rotation != 3) {
            System.arraycopy(this.f23647OooOoO0, 0, this.f23646OooOoO, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f23647OooOoO0, 130, 1, this.f23646OooOoO);
        }
        float[] fArr2 = this.f23646OooOoO;
        float f = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f;
        float f2 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f2;
        float f3 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f3;
        synchronized (this.f23645OooOo0o) {
            System.arraycopy(this.f23646OooOoO, 0, this.f23648OooOoOO, 0, 9);
        }
        C2016rm c2016rm = this.f23649OooOoo;
        if (c2016rm != null) {
            synchronized (c2016rm.f23897Oooo) {
                c2016rm.f23897Oooo.notifyAll();
            }
        }
    }

    public final void OooO0O0() {
        if (this.f23650OooOoo0 == null) {
            return;
        }
        this.f23644OooOo0O.unregisterListener(this);
        this.f23650OooOoo0.post(new RunnableC2105u0(2));
        this.f23650OooOoo0 = null;
    }

    public final boolean OooO0OO(float[] fArr) {
        synchronized (this.f23645OooOo0o) {
            try {
                float[] fArr2 = this.f23648OooOoOO;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
