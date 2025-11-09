package o00OOOoO;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.OooOo;
import o00Oo0oo.o00oO0o;

/* loaded from: classes3.dex */
public final class o00O0000 extends o00000O {

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final Socket f32605OooOOO0;

    public o00O0000(Socket socket) {
        OooOo.OooO0o0(socket, "socket");
        this.f32605OooOOO0 = socket;
    }

    @Override // o00OOOoO.o00000O
    public final void OooOO0() throws IOException {
        Socket socket = this.f32605OooOOO0;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!o00oO0o.OooO(e)) {
                throw e;
            }
            o000O0.f32570OooO00o.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            o000O0.f32570OooO00o.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public final IOException OooOO0O(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
