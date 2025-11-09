package o00OOOOo;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class o000000 extends IOException {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f32450OooOo0O;

    /* JADX WARN: Illegal instructions before constructor call */
    public o000000(int i) {
        String str;
        switch (i) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "PROTOCOL_ERROR";
                break;
            case 3:
                str = "INTERNAL_ERROR";
                break;
            case 4:
                str = "FLOW_CONTROL_ERROR";
                break;
            case 5:
                str = "REFUSED_STREAM";
                break;
            case 6:
                str = "CANCEL";
                break;
            case 7:
                str = "COMPRESSION_ERROR";
                break;
            case 8:
                str = "CONNECT_ERROR";
                break;
            case 9:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 10:
                str = "INADEQUATE_SECURITY";
                break;
            case 11:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        super("stream was reset: ".concat(str));
        this.f32450OooOo0O = i;
    }
}
