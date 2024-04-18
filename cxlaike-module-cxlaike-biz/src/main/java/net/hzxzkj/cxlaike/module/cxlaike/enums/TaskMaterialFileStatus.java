package net.hzxzkj.cxlaike.module.cxlaike.enums;

import cn.hutool.core.util.ArrayUtil;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.hzxzkj.cxlaike.framework.common.core.IntArrayValuable;

/**
 * 描   述:
 *
 * @author ace
 * @version [版本号, 2023/9/6]
 * @see [相关类/方法]
 * 创建日期: 2023/9/6
 */
@Getter
@AllArgsConstructor
public enum TaskMaterialFileStatus implements IntArrayValuable {

  /**
   * 处理中
   */
  PROCESSING(0, "处理中"),

  /**
   * 成功
   */
  SUCCESS(1, "成功"),

  /**
   * 失败
   */
  FAIL(2, "失败");


  private final Integer type;

  private final String value;

  public static final int[] ARRAYS = Arrays.stream(values())
      .mapToInt(TaskMaterialFileStatus::getType)
      .toArray();


  public static TaskMaterialFileStatus valueOfType(Integer type) {
    return ArrayUtil.firstMatch(o -> o.getType().equals(type), values());
  }

  @Override
  public int[] array() {
    return ARRAYS;
  }
}
