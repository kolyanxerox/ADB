package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class OooOO0O implements Oooo0 {

    /* renamed from: OooOo0O */
    public final Double f26425OooOo0O;

    public OooOO0O(Double d) {
        if (d == null) {
            this.f26425OooOo0O = Double.valueOf(Double.NaN);
        } else {
            this.f26425OooOo0O = d;
        }
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 OooO0Oo(String str, C2051sk c2051sk, ArrayList arrayList) throws NumberFormatException {
        if ("toString".equals(str)) {
            return new o00O0O(zzc());
        }
        throw new IllegalArgumentException(zzc() + "." + str + " is not a function.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOO0O) {
            return this.f26425OooOo0O.equals(((OooOO0O) obj).f26425OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26425OooOo0O.hashCode();
    }

    public final String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final String zzc() throws NumberFormatException {
        Double d = this.f26425OooOo0O;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Double zzd() {
        return this.f26425OooOo0O;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Boolean zze() {
        Double d = this.f26425OooOo0O;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 zzt() {
        return new OooOO0O(this.f26425OooOo0O);
    }
}
