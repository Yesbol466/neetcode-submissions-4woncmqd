class StringIterator:
    
    def __init__(self, compressedString: str):
        self.res = compressedString
        self.ptr = 0
        self.num = 0
        self.ch = ' '
    
    def next(self) -> str:
        if not self.hasNext():
            return ' '
        
        if self.num == 0:
            self.ch = self.res[self.ptr]
            self.ptr += 1
            while self.ptr < len(self.res) and self.res[self.ptr].isdigit():
                self.num = self.num * 10 + int(self.res[self.ptr])
                self.ptr += 1

        self.num -= 1
        return self.ch
    
    def hasNext(self) -> bool:
        return self.ptr != len(self.res) or self.num != 0