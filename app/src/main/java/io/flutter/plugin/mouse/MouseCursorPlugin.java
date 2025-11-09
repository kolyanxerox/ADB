package io.flutter.plugin.mouse;

import android.view.PointerIcon;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.PointerIconCompat;
import com.ironsource.C3034d9;
import com.ironsource.C3069e9;
import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
import java.util.HashMap;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

@RequiresApi(24)
/* loaded from: classes3.dex */
public class MouseCursorPlugin {

    @NonNull
    private static HashMap<String, Integer> systemCursorConstants;

    @NonNull
    private final MouseCursorViewDelegate mView;

    @NonNull
    private final MouseCursorChannel mouseCursorChannel;

    public interface MouseCursorViewDelegate {
        @NonNull
        PointerIcon getSystemPointerIcon(int i);

        void setPointerIcon(@NonNull PointerIcon pointerIcon);
    }

    public MouseCursorPlugin(@NonNull MouseCursorViewDelegate mouseCursorViewDelegate, @NonNull MouseCursorChannel mouseCursorChannel) {
        this.mView = mouseCursorViewDelegate;
        this.mouseCursorChannel = mouseCursorChannel;
        mouseCursorChannel.setMethodHandler(new MouseCursorChannel.MouseCursorMethodHandler() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.MouseCursorChannel.MouseCursorMethodHandler
            public void activateSystemCursor(@NonNull String str) {
                MouseCursorPlugin.this.mView.setPointerIcon(MouseCursorPlugin.this.resolveSystemCursor(str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointerIcon resolveSystemCursor(@NonNull String str) {
        if (systemCursorConstants == null) {
            systemCursorConstants = new HashMap<String, Integer>() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.2
                private static final long serialVersionUID = 1;

                {
                    put(MimeTypesReaderMetKeys.ALIAS_TAG, 1010);
                    put("allScroll", 1013);
                    put("basic", 1000);
                    put("cell", 1006);
                    put(C3069e9.f8387d, 1002);
                    put("contextMenu", 1001);
                    put("copy", 1011);
                    Integer numValueOf = Integer.valueOf(PointerIconCompat.TYPE_NO_DROP);
                    put("forbidden", numValueOf);
                    put("grab", 1020);
                    put("grabbing", 1021);
                    put("help", 1003);
                    put("move", 1013);
                    put("none", 0);
                    put("noDrop", numValueOf);
                    put("precise", 1007);
                    put(C3034d9.h.f8077K0, 1008);
                    put("resizeColumn", 1014);
                    put("resizeDown", 1015);
                    put("resizeUpLeft", 1016);
                    Integer numValueOf2 = Integer.valueOf(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW);
                    put("resizeDownRight", numValueOf2);
                    put("resizeLeft", 1014);
                    put("resizeLeftRight", 1014);
                    put("resizeRight", 1014);
                    put("resizeRow", 1015);
                    put("resizeUp", 1015);
                    put("resizeUpDown", 1015);
                    put("resizeUpLeft", numValueOf2);
                    put("resizeUpRight", 1016);
                    put("resizeUpLeftDownRight", numValueOf2);
                    put("resizeUpRightDownLeft", 1016);
                    put("verticalText", 1009);
                    put("wait", 1004);
                    put("zoomIn", 1018);
                    put("zoomOut", 1019);
                }
            };
        }
        return this.mView.getSystemPointerIcon(systemCursorConstants.getOrDefault(str, 1000).intValue());
    }

    public void destroy() {
        this.mouseCursorChannel.setMethodHandler(null);
    }
}
