package net.hzxzkj.cxlaike.module.cxlaike.controller.merchant.dycomment.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Schema(description = "管理后台 - 抖音评论管理创建 Request VO")
@Data
@ToString(callSuper = true)
public class DyCommentReplyReqVO {

    @Schema(description = "id", requiredMode = Schema.RequiredMode.REQUIRED, example = "30405")
    @NotNull(message = "id不能为空")
    private Long id;

    @Schema(description = "回复内容", requiredMode = Schema.RequiredMode.REQUIRED, example = "30405")
    @NotBlank(message = "回复内容不能为空")
    private String content;
}
