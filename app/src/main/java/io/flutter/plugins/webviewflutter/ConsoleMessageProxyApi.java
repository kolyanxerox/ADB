package io.flutter.plugins.webviewflutter;

import android.webkit.ConsoleMessage;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class ConsoleMessageProxyApi extends PigeonApiConsoleMessage {

    /* renamed from: io.flutter.plugins.webviewflutter.ConsoleMessageProxyApi$1 */
    public static /* synthetic */ class C45061 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$ConsoleMessage$MessageLevel;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            $SwitchMap$android$webkit$ConsoleMessage$MessageLevel = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ConsoleMessageProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiConsoleMessage
    @NonNull
    public ConsoleMessageLevel level(@NonNull ConsoleMessage consoleMessage) {
        int i = C45061.$SwitchMap$android$webkit$ConsoleMessage$MessageLevel[consoleMessage.messageLevel().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? ConsoleMessageLevel.UNKNOWN : ConsoleMessageLevel.DEBUG : ConsoleMessageLevel.ERROR : ConsoleMessageLevel.WARNING : ConsoleMessageLevel.LOG : ConsoleMessageLevel.TIP;
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiConsoleMessage
    public long lineNumber(@NonNull ConsoleMessage consoleMessage) {
        return consoleMessage.lineNumber();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiConsoleMessage
    @NonNull
    public String message(@NonNull ConsoleMessage consoleMessage) {
        return consoleMessage.message();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiConsoleMessage
    @NonNull
    public String sourceId(@NonNull ConsoleMessage consoleMessage) {
        return consoleMessage.sourceId();
    }
}
