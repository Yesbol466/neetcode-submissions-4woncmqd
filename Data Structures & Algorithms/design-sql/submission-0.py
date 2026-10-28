class SQL:
    def __init__(self, names: List[str], columns: List[int]):
        self.width = dict(zip(names, columns))
        self.next_id = {name: 1 for name in names}
        self.rows = {name: {} for name in names}
    def ins(self, name: str, row: List[str]) -> bool:
        if name not in self.width or len(row) != self.width[name]: return False
        self.rows[name][self.next_id[name]] = list(row)
        self.next_id[name] += 1
        return True
    def rmv(self, name: str, rowId: int) -> None:
        if name in self.rows: self.rows[name].pop(rowId, None)
    def sel(self, name: str, rowId: int, columnId: int) -> str:
        row = self.rows.get(name, {}).get(rowId)
        return row[columnId-1] if row is not None and 1 <= columnId <= len(row) else '<null>'
    def exp(self, name: str) -> List[str]:
        return [','.join([str(i)] + row) for i, row in sorted(self.rows.get(name, {}).items())]
